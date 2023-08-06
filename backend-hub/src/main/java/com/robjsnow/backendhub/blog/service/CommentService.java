package com.robjsnow.backendhub.blog.service;

import com.robjsnow.backendhub.blog.model.Comment;
import com.robjsnow.backendhub.blog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    private final CommentRepository repository;

    @Autowired
    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public List<Comment> getAllComments() {
        return repository.findAll();
    }

    public Optional<Comment> getCommentById(Long id) {
        return repository.findById(id);
    }

    public List<Comment> getAllCommentsForPost(Long postId) {
        return repository.findByPostId(postId);
    }
    
    public Comment saveComment(Comment comment) {
        return repository.save(comment);
    }

    public void deleteComment(Long id) {
        repository.deleteById(id);
    }
}