package com.rolnicza.spoldzielnia.repository;

import com.rolnicza.spoldzielnia.modele.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmRepository extends JpaRepository<Farm,Integer> {
}
