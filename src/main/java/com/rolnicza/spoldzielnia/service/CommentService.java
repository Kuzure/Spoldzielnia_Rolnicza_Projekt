package com.rolnicza.spoldzielnia.service;

import com.rolnicza.spoldzielnia.modele.Comment;
import com.rolnicza.spoldzielnia.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    public void addComent(Comment comment){
        commentRepository.save(comment);
    }
}
