package com.rysk.blog.interfaces;

import com.rysk.blog.entity.Comment;
import com.rysk.blog.request.CommentRequest;
import org.springframework.stereotype.Component;

@Component
public interface ICommentService {

    public Comment save(Integer blogId, CommentRequest commentRequest);
}
