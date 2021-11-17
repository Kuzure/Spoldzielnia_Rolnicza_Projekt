package com.rolnicza.spoldzielnia.repository;

import com.rolnicza.spoldzielnia.modele.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends JpaRepository<Farm,Integer> {
}
