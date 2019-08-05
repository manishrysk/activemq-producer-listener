package com.rysk.blog.repository;

import com.rysk.blog.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    public Page<Comment> findByBlogId(Integer blogId, Pageable pageable);
}
