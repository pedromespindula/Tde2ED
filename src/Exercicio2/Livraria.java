package Exercicio2;
import java.util.ArrayList;


public class Livraria {
        private ArrayList<Livro> livros;

        public Livraria() {
            livros = new ArrayList<>();
        }

        public void inserirLivro(Livro livro) {
            livros.add(livro);
            System.out.println("Livro '" + livro.getTitulo() + "' adicionado à livraria.");
        }

        public void listarLivros() {
            System.out.println("Lista completa de livros:");
            for (Livro livro : livros) {
                livro.exibirDetalhes();
                System.out.println();
            }
        }

        public void listarDisponiveis() {
            System.out.println("Livros disponíveis para empréstimo:");
            for (Livro livro : livros) {
                if (livro.isDisponivel()) {
                    livro.exibirDetalhes();
                    System.out.println();
                }
            }
        }

    public Livro getLivro(int index) {
        if (index >= 0 && index < livros.size()) {
            return livros.get(index);
        }
        return null;
    }
}
