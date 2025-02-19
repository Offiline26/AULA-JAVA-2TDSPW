package br.com.fiap.api_rest.Dto;

import br.com.fiap.api_rest.model.Categoria;
import jakarta.validation.constraints.*;

public class LivroRequest {
    @NotBlank(message = "O titulo não pode ser vazio")
    @Size(min = 3, max =254, message = "O titulo deve ter entre entre 3 e 254 caracteres")
    private String titulo;
    @NotBlank(message = "O titulo não pode ser vazio")
    @Size(min = 3, max =150, message = "O titulo deve ter entre entre 3 e 150 caracteres")
    private String autor;
    @Min(value = 1, message = "O preço deve ser no minimo 1")
    @Max(value = 99, message = "O preço deve ser no máximo 99")
    private int preco;
    @NotNull(message = "A categoria é obrigatoria")
    private Categoria categoria;
    @Pattern(regexp = "^970\\d{10}$|^970\\d{7}$")
    private String isbn;

    public String getTitulo() {
        System.out.println("Alguma\" coisa");
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getIsnb() {
        return isbn;
    }

    public void setIsnb(String isnb) {
        this.isbn = isnb;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LivroRequest(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
