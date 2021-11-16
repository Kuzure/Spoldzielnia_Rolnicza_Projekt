package com.rolnicza.spoldzielnia.modele;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "order_position")
@Entity
@Getter
@Setter
public class OrderPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_orderposition")
    @SequenceGenerator(name = "gen_orderposition", sequenceName = "seq_orderposition", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "price")
    private Double price;

    @OneToMany(mappedBy = "orderPosition", orphanRemoval = true)
    private List<Product> productId;


}