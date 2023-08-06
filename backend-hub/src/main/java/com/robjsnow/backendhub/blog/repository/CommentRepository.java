package com.robjsnow.backendhub.blog.repository;

import com.robjsnow.backendhub.blog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(Long postId);    
}



