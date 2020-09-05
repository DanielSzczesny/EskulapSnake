package pl.EskulapSnake.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Role {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private  String name;


}
