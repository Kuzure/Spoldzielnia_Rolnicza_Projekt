package com.rolnicza.spoldzielnia.repository;

import com.rolnicza.spoldzielnia.modele.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
