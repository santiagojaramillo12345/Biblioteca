package com.example.Pruebapersonal.entitys;


import jakarta.persistence.*;

@Entity
@Table(name="categorias")

public class InfoAdicional {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @OneToOne
    @JoinColumn(name="id_libro")
    private Libro libro;
    @Column(name="idioma")
    private String idioma;
    @Column(name="fechaPublicacion")
    private String fechaPublicacion;





}
