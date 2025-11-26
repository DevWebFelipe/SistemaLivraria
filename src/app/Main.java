package app;

import model.Emprestimo;
import repository.Biblioteca;

import java.util.Date;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("Sistema iniciado!");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quer ver os livros disponíveis? (s/n)");
            String response = scanner.nextLine();

            if (!response.equalsIgnoreCase("s") && !response.equalsIgnoreCase("n")) {
                System.out.println("Resposta inválida!");
                continue;
            }

            if (!response.equalsIgnoreCase("s")) {
                if (!biblioteca.emprestimos.isEmpty()) System.out.println("Empréstimos do dia:");
                for (int i = 0; i < biblioteca.emprestimos.size(); i++) {
                    System.out.println("Cliente: " + biblioteca.emprestimos.get(i).nomeCliente +
                            " | Livro: " + biblioteca.emprestimos.get(i).livro +
                            " | Data: " + biblioteca.emprestimos.get(i).dataEmpresitmo);
                }

                System.out.println("Sistema finalizado!");
                break;
            }

            for (int i = 0; i < biblioteca.livros.size(); i++) {
                if (biblioteca.livros.get(i).disponivel) {
                    System.out.println("Id = " + biblioteca.livros.get(i).id +
                            " | Autor = " + biblioteca.livros.get(i).autor +
                            " | Livro = " + biblioteca.livros.get(i).titulo);
                }
            }

            System.out.println("Deseja solicitar empréstimo de algum livro? (s/n)");
            response = scanner.nextLine();

            if (!response.equalsIgnoreCase("s") && !response.equalsIgnoreCase("n")) {
                System.out.println("Resposta inválida!");
                continue;
            }

            if (!response.equalsIgnoreCase("s")) {
                System.out.println("Sistema finalizado!");
                break;
            }

            while (true) {
                System.out.println("Qual Id do livro desejado?");
                String idLivroSelecionado = scanner.nextLine();
                boolean nenhumLivroSelecionado = true;

                for (int i = 0; i < biblioteca.livros.size(); i++) {
                    if (biblioteca.livros.get(i).id.equals(idLivroSelecionado)) {
                        while (true) {
                            System.out.println("Informe seu nome para registrar do empréstimo");
                            String nomeCliente = scanner.nextLine();

                            if (nomeCliente.isEmpty()) continue;

                            Emprestimo emprestimo = new Emprestimo();
                            emprestimo.id = String.valueOf(biblioteca.emprestimos.size() + 1);
                            emprestimo.livro = biblioteca.livros.get(i).titulo;
                            emprestimo.nomeCliente = nomeCliente;
                            emprestimo.dataEmpresitmo = new Date();
                            biblioteca.emprestimos.add(emprestimo);

                            System.out.println("Livro emprestado -> Id = " + biblioteca.livros.get(i).id +
                                    " | Autor = " + biblioteca.livros.get(i).autor +
                                    " | Livro = " + biblioteca.livros.get(i).titulo +
                                    " | Para o cliente " + nomeCliente);

                            break;
                        }

                        biblioteca.livros.get(i).disponivel = false;
                        nenhumLivroSelecionado = false;
                    }
                }

                if (nenhumLivroSelecionado) {
                    System.out.println("O Id selecionado não corresponde a um livro disponível!");
                    continue;
                }

                break;
            }
        }
    }
}
