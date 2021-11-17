package com.rolnicza.spoldzielnia.service;

import com.rolnicza.spoldzielnia.modele.Order;
import com.rolnicza.spoldzielnia.repository.OrderRepository;
import com.rolnicza.spoldzielnia.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class OrderService {


    private final OrderRepository orderRepository;
    public void addOrder(Order order){
        orderRepository.save(order);
    }
    public void editOrder(Order order){
        orderRepository.save(order);
    }
}
