package com.rolnicza.spoldzielnia.modele;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "field")
@Entity
@Getter
@Setter
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_field")
    @SequenceGenerator(name = "gen_field", sequenceName = "seq_field", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "capacity")
    private Double capacity;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "farm_id")
    private Farm farm;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}