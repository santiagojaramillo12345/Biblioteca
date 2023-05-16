package com.example.Pruebapersonal.entitys;

import jakarta.persistence.*;


@Entity
@Table(name="libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private Integer id;
    @OneToMany
    @JoinColumn(name="categoria_id")
    private Categoria categoria;
    @OneToMany
    @JoinColumn(name="editorial_id")
    private Editorial editorial;
    @Column(name="titulo")
    private String titulo;
    @Column(name="descricion")
    private String descricion;
    @Column(name="favorite")
    private String favorite;

    @OneToOne(mappedBy = "libro",cascade = CascadeType.ALL)
private InfoAdicional infoAdicional;

}
