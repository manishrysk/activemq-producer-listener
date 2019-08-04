package com.rysk.blog.interfaces;

import com.rysk.blog.entity.Blog;
import com.rysk.blog.request.BlogRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public interface IBlogService {

    public Blog save(BlogRequest blogRequest);

    public Blog get(Integer id);

    public void delete(Integer id);

    public Page<Blog> getAll(Integer page);
}
