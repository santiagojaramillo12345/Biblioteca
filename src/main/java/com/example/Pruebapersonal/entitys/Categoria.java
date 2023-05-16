package com.example.Pruebapersonal.entitys;


import jakarta.persistence.*;

@Entity
@Table(name="categorias")

public class Categoria {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")

private Integer id;


    @Column(name="categoria")
private Categoria categoria;

    public Categoria() {
    }

    public Categoria(Integer id, Categoria categoria) {
        this.id = id;
        this.categoria = categoria;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
