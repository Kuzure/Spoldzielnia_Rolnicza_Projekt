package com.rolnicza.spoldzielnia.service;

import com.rolnicza.spoldzielnia.modele.Comment;
import com.rolnicza.spoldzielnia.modele.Field;
import com.rolnicza.spoldzielnia.repository.CommentRepository;
import com.rolnicza.spoldzielnia.repository.FieldRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class FieldService {
    private final FieldRepository fieldRepository;
    public void addField(Field field){
        fieldRepository.save(field);
    }
    public void editField(Field field){
        fieldRepository.save(field);
    }
}
