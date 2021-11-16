package com.rolnicza.spoldzielnia.repository;

import com.rolnicza.spoldzielnia.modele.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
