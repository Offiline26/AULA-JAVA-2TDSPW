package br.com.fiap.api_rest.Service;

import br.com.fiap.api_rest.Dto.LivroRequest;
import br.com.fiap.api_rest.Dto.LivroRequestDTO;
import br.com.fiap.api_rest.Dto.LivroResponse;
import br.com.fiap.api_rest.model.Livro;
import br.com.fiap.api_rest.repository.LivroRepository;
import org.springframework.stereotype.Service;

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

}
