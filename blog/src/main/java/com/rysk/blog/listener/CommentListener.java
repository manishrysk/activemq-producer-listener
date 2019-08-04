package com.rysk.blog.listener;

import com.rysk.blog.entity.Comment;
import com.rysk.blog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CommentListener {

    @Autowired
    private CommentRepository commentRepository;

    @JmsListener(destination = "comment-queue")
    public void saveComment(Comment comment){
        commentRepository.save(comment);
    }
}
