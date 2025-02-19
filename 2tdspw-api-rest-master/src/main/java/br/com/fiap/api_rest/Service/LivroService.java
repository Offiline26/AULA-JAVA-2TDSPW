package br.com.fiap.api_rest.Service;

import br.com.fiap.api_rest.Dto.LivroRequest;
import br.com.fiap.api_rest.Dto.LivroRequestDTO;
import br.com.fiap.api_rest.Dto.LivroResponse;
import br.com.fiap.api_rest.model.Livro;
import br.com.fiap.api_rest.repository.LivroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {
    public Livro requestToLivro(LivroRequest livroRequest){
        Livro livro = new Livro();
        livro.setAutor(livroRequest.getAutor());
        livro.setTitulo(livroRequest.getTitulo());
        return livro;
    }

    public Livro recordToLivro(LivroRequestDTO livroRecord){
        Livro livro = new Livro();
        livro.setTitulo(livroRecord.titulo());
        livro.setTitulo(livroRecord.autor());
        return livro;
    }

    public LivroResponse livroToResponse(Livro livro){
        return new LivroResponse(livro.getAutor() + " - " + livro.getTitulo());
    }

    public List<LivroResponse> livrosToResponse(List<Livro> livros){
        List<LivroResponse> listaLivros = new ArrayList<>();
        for(Livro livro: livros) {
            listaLivros.add(livroToResponse(livro));
        }
        return listaLivros;
    }
    //public List<LivroResponse> livrosToResponse2(List<Livro> livros){
    //    return livros.stream().map(this::livroToResponse).collect(Collectors.toList());
    //}

}
