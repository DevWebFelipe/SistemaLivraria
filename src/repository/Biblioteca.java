package repository;

import model.Autor;
import model.Emprestimo;
import model.Livro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    public List<Livro> livros = new ArrayList<>();
    public List<Autor> autores = new ArrayList<>();
    public List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        // inicialização dos livros
        Livro l1 = new Livro();
        l1.id = "1";
        l1.titulo = "Livro de história 1";
        l1.autor = "Autor livro 1";
        l1.disponivel = true;
        l1.dataCadastro = new Date();
        l1.dataAtualizacao = new Date();

        Livro l2 = new Livro();
        l2.id = "2";
        l2.titulo = "Livro de história 2";
        l2.autor = "Autor livro 2";
        l2.disponivel = false;
        l2.dataCadastro = new Date();
        l2.dataAtualizacao = new Date();

        Livro l3 = new Livro();
        l3.id = "3";
        l3.titulo = "Livro de história 3";
        l3.autor = "Autor livro 3";
        l3.disponivel = true;
        l3.dataCadastro = new Date();
        l3.dataAtualizacao = new Date();

        Livro l4 = new Livro();
        l4.id = "4";
        l4.titulo = "Livro de história 4";
        l4.autor = "Autor livro 4";
        l4.disponivel = true;
        l4.dataCadastro = new Date();
        l4.dataAtualizacao = new Date();

        // Adicionando na lista
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        livros.add(l4);

        // inicialização dos autores
        Autor a1 = new Autor();
        a1.id = "1";
        a1.nome = "Autor livro 1";
        a1.dataNascimento = new Date();

        Autor a2 = new Autor();
        a2.id = "2";
        a2.nome = "Autor livro 2";
        a2.dataNascimento = new Date();

        // Adicionando na lista
        autores.add(a1);
        autores.add(a2);
    }

}
