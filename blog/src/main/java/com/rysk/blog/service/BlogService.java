package com.rysk.blog.service;

import com.rysk.blog.entity.Blog;
import com.rysk.blog.entity.Category;
import com.rysk.blog.entity.User;
import com.rysk.blog.exception.RecordNotFoundException;
import com.rysk.blog.interfaces.IBlogService;
import com.rysk.blog.repository.BlogRepository;
import com.rysk.blog.request.BlogRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> getAll(Integer page) {
        return blogRepository.findAll(PageRequest.of(page - 1, 10, Sort.by("createdAt").descending()));
    }

    @Override
    public Blog save(BlogRequest blogRequest) {
        Blog blog;
        if (null != blogRequest.getId()) {
            blog = blogRepository.getOne(blogRequest.getId());
            blog.setUpdatedAt(new Date());
        } else {
            blog = new Blog();
            blog.setCreatedAt(new Date());
        }

        BeanUtils.copyProperties(blogRequest, blog);

        Category category = new Category(blogRequest.getCategoryId());
        User user = new User(blogRequest.getUserId());
        Set<Integer> tagIds = blogRequest.getTagIds();

        if (null != tagIds || !tagIds.isEmpty())
            tagIds.stream().forEach(tagId -> blog.addTag(tagId));

        blog.setCategory(category);
        blog.setUser(user);

        return blogRepository.save(blog);
    }

    @Override
    public Blog get(Integer id) {
        Optional<Blog> blog = blogRepository.findById(id);
        if(!blog.isPresent()) throw new RecordNotFoundException("Invalid blog ID : "+id);
        return blog.get();
    }

    @Override
    public void delete(Integer id) {
        blogRepository.delete(blogRepository.getOne(id));
    }

}
