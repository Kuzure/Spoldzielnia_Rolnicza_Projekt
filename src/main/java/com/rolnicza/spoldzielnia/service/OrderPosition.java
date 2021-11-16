package com.rolnicza.spoldzielnia.service;

import com.rolnicza.spoldzielnia.modele.Farm;
import com.rolnicza.spoldzielnia.modele.Order;
import com.rolnicza.spoldzielnia.repository.FarmRepository;
import com.rolnicza.spoldzielnia.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class OrderPosition {
    private final OrderRepository orderRepository;
    public void addOrder(Order order){
        orderRepository.save(order);
    }
    public void removeOrder(Order order){
        orderRepository.delete(order);
    }
    public void editOrder(Order order){
        orderRepository.save(order);
    }
}
