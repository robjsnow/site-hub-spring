package com.robjsnow.backendhub.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.robjsnow.backendhub.blog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {}