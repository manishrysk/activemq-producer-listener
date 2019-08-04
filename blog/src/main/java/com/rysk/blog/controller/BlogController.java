package com.rysk.blog.controller;

import com.rysk.blog.entity.Blog;
import com.rysk.blog.request.BlogRequest;
import com.rysk.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/blogs")
    public ResponseEntity<Page<Blog>> getAll(@RequestParam(name = "page", defaultValue = "1", required = false) Integer page){
        return new ResponseEntity<>(blogService.getAll(page), HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> get(@PathVariable Integer id){
        return new ResponseEntity<>(blogService.get(id), HttpStatus.OK);
    }

    @PostMapping("/blog")
    public ResponseEntity<Blog> save(@Valid @RequestBody BlogRequest blogRequest) {
        return new ResponseEntity<>(blogService.save(blogRequest), HttpStatus.CREATED);
    }

    @PutMapping("/blog")
    public ResponseEntity<Blog> put(@Valid @RequestBody BlogRequest blogRequest) {
        return new ResponseEntity<>(blogService.save(blogRequest), HttpStatus.CREATED);
    }

    @DeleteMapping("/blog/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        blogService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
