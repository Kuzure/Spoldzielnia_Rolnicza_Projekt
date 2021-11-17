package com.rolnicza.spoldzielnia.repository;

import com.rolnicza.spoldzielnia.modele.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository<Field,Integer> {
}
