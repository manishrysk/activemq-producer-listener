package com.rysk.blog.controller;

import com.rysk.blog.entity.Comment;
import com.rysk.blog.interfaces.ICommentService;
import com.rysk.blog.request.CommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/blog")
@RestController
public class CommentController {

    @Autowired
    private ICommentService commentService;

    @PostMapping("/{blogId}/comment")
    public ResponseEntity<Comment> save(@PathVariable(name = "blogId") Integer blogId, @Valid @RequestBody CommentRequest commentRequest) {
        return new ResponseEntity<>(commentService.save(blogId, commentRequest), HttpStatus.CREATED);
    }

    @GetMapping("/{blogId}/comments")
    public ResponseEntity<Page<Comment>> getAll(@RequestParam Integer page, @PathVariable Integer blogId) {
        return new ResponseEntity<>(commentService.getAll(blogId, page), HttpStatus.OK);
    }
}
