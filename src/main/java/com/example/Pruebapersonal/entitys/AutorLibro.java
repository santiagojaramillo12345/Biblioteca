package com.example.Pruebapersonal.entitys;

import jakarta.persistence.*;

@Entity
@Table(name="autorLibro")
public class AutorLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  Integer id;


    @OneToMany
    @JoinColumn(name="id_autor")
    private Autor autor;
    @OneToMany
    @JoinColumn(name="id_libro")
    private Libro libro;

}
