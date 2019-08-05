package com.rysk.blog.service;

import com.rysk.blog.entity.Comment;
import com.rysk.blog.entity.User;
import com.rysk.blog.interfaces.ICommentService;
import com.rysk.blog.repository.CommentRepository;
import com.rysk.blog.request.CommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CommentService implements ICommentService {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment save(Integer blogId, CommentRequest commentRequest) {
        Comment comment = new Comment();
        comment.setBlogId(blogId);
        comment.setCreatedAt(new Date());
        comment.setUser(new User(commentRequest.getCreatedBy()));
        comment.setComment(commentRequest.getComment());

        jmsTemplate.convertAndSend("comment-queue", comment);
        return comment;
    }

    @Override
    public Page<Comment> getAll(Integer blogId, Integer page) {
        return commentRepository.findByBlogId(blogId, PageRequest.of(page - 1, 10, Sort.by("createdAt")));
    }
}
