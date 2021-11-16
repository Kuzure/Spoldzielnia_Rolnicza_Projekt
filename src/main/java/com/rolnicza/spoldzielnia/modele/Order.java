package com.rolnicza.spoldzielnia.modele;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "order")
@Entity
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Idgen_order")
    @SequenceGenerator(name = "Idgen_order", sequenceName = "Idseq_oder", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "sum_price")
    private Double sumPrice;

    @Column(name = "contract_date")
    private Date contractDate;

    @Column(name = "description")
    private String description;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_id")
    private String userId;


}