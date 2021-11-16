package com.rolnicza.spoldzielnia.service;

import com.rolnicza.spoldzielnia.modele.Comment;
import com.rolnicza.spoldzielnia.modele.Farm;
import com.rolnicza.spoldzielnia.repository.CommentRepository;
import com.rolnicza.spoldzielnia.repository.FarmRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class FarmService {
    private final FarmRepository farmRepository;
    public void addFarm(Farm farm){
        farmRepository.save(farm);
    }
    public void removeFarm(Farm farm){
        farmRepository.delete(farm);
    }
    public void editFarm(Farm farm){
        farmRepository.save(farm);
    }
}
