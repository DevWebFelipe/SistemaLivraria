package app;

import repository.Biblioteca;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quer ver os livros disponíveis? (s/n)");

            String response = scanner.nextLine(); // lê o que o usuário digitou

            if (!response.equals("s")) {
                System.out.println("Sistema finalizado!");
                break;
            }

            System.out.println("Sistema iniciado!");

            for (int i = 0; i < biblioteca.livros.toArray().length; i++) {
                if (biblioteca.livros.get(i).disponivel) {
                    System.out.println("Id = " + biblioteca.livros.get(i).id.toString() +
                            " | Autor = " + biblioteca.livros.get(i).autor +
                            " | Livro = " + biblioteca.livros.get(i).titulo);
                }
            }

            System.out.println("Deseja solicitar empréstimo de algum livro? (s/n)");
            response = scanner.nextLine();

            if (!response.equals("s")) {
                System.out.println("Sistema finalizado!");
                break;
            }

            while (true) {
                System.out.println("Qual Id do livro desejado?");
                String idLivroSelecionado = scanner.nextLine();
                boolean nenhumLivroSelecionado = true;

                for (int i = 0; i < biblioteca.livros.toArray().length; i++) {
                    if (biblioteca.livros.get(i).id.toString().equals(idLivroSelecionado)) {
                        System.out.println("Informe seu nome para registrar do empréstimo");
                        String nomeCliente = scanner.nextLine();

                        System.out.println("Livro emprestado -> Id = " + biblioteca.livros.get(i).id.toString() +
                                " | Autor = " + biblioteca.livros.get(i).autor +
                                " | Livro = " + biblioteca.livros.get(i).titulo +
                                " | Para o cliente " + nomeCliente);

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
