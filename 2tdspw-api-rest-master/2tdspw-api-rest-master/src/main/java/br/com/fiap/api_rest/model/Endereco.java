package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String localizacao;
    @OneToOne(mappedBy = "endereco")
    private Biblioteca biblioteca;
}
