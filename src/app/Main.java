package app;

import repository.Biblioteca;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        int teste = 0;

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
                    System.out.println("Livro = " + biblioteca.livros.get(i).titulo);
                }
            }

            teste++;
        }
    }
}
