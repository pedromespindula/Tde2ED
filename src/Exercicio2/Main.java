package Exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livraria livraria = new Livraria();

        livraria.inserirLivro(new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 576));
        livraria.inserirLivro(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 233));
        livraria.inserirLivro(new Livro("O Menino do Pijama Listrado", "John Boyne", 192));

        boolean running = true;

        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Listar todos os livros");
            System.out.println("2. Listar livros disponíveis");
            System.out.println("3. Reservar um livro");
            System.out.println("4. Devolver um livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    livraria.listarLivros();
                    break;
                case 2:
                    livraria.listarDisponiveis();
                    break;
                case 3:
                    livraria.listarLivros();
                    System.out.print("Digite o número do livro que deseja reservar: ");
                    int reservaIndex = scanner.nextInt() - 1;
                    Livro livroReservar = livraria.getLivro(reservaIndex);
                    if (livroReservar != null) {
                        livroReservar.reservar();
                    } else {
                        System.out.println("Livro inválido.");
                    }
                    break;
                case 4:
                    livraria.listarLivros();
                    System.out.print("Digite o número do livro que deseja devolver: ");
                    int devolverIndex = scanner.nextInt() - 1;
                    Livro livroDevolver = livraria.getLivro(devolverIndex);
                    if (livroDevolver != null) {
                        livroDevolver.devolver();
                    } else {
                        System.out.println("Livro inválido.");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}

