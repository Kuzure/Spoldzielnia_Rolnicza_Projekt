package com.rolnicza.spoldzielnia.modele;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "comment")
@Entity
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_comment")
    @SequenceGenerator(name = "gen_comment", sequenceName = "seq_comment", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private Order order;


}