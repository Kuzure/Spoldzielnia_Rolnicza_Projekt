package com.rolnicza.spoldzielnia.service;

import com.rolnicza.spoldzielnia.modele.Field;
import com.rolnicza.spoldzielnia.modele.Product;
import com.rolnicza.spoldzielnia.repository.FieldRepository;
import com.rolnicza.spoldzielnia.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public void addProduct(Product product){
        productRepository.save(product);
    }
    public void editProduct(Product product){
        productRepository.save(product);
    }

}
