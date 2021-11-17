package com.rolnicza.spoldzielnia.repository;

import com.rolnicza.spoldzielnia.modele.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
