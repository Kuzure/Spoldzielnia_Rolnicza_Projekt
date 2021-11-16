package com.rolnicza.spoldzielnia.modele;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Table(name = "product")
@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_product")
    @SequenceGenerator(name = "gen_product", sequenceName = "seq_product", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "best_before_date")
    private Date bestBeforeDate;

    @OneToMany(mappedBy = "product", orphanRemoval = true)
    private List<Field> fields;

    @ManyToOne
    @JoinColumn(name = "order_position_id")
    private OrderPosition orderPosition;


}