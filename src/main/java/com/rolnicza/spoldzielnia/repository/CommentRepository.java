package com.rolnicza.spoldzielnia.repository;

import com.rolnicza.spoldzielnia.modele.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
