package br.com.fiap.api_rest.model;

public enum Categoria {
    ROMANCE("Romance"),
    FICCAO("Ficçao"),
    FANTASIA("Fantasia");

    private String descricao;
    Categoria(String descricao){
        this.descricao= descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
