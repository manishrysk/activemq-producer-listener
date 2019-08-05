package com.rysk.blog.interfaces;

import com.rysk.blog.entity.Comment;
import com.rysk.blog.request.CommentRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public interface ICommentService {

    public Comment save(Integer blogId, CommentRequest commentRequest);

    public Page<Comment> getAll(Integer blogId, Integer page);
}
