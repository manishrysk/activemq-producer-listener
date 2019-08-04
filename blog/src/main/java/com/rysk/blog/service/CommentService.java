package com.rysk.blog.service;

import com.rysk.blog.entity.Comment;
import com.rysk.blog.entity.User;
import com.rysk.blog.interfaces.ICommentService;
import com.rysk.blog.request.CommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CommentService implements ICommentService {

    @Autowired
    private JmsTemplate jmsTemplate;

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
}
