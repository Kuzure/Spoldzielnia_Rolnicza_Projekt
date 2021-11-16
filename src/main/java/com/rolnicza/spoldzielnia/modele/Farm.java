package com.rolnicza.spoldzielnia.modele;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "farm")
@Entity
@Getter
@Setter
public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_farm")
    @SequenceGenerator(name = "gen_farm", sequenceName = "seq_farm", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "address")
    private String address;


}