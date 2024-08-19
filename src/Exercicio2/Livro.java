package Exercicio2;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroPag;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int numeroPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
        this.disponibilidade = true;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPag);
        System.out.println("Disponibilidade: " + (disponibilidade ? "Disponível" : "Indisponível"));
    }

    public void reservar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("O livro '" + titulo + "' foi reservado com sucesso.");
        } else {
            System.out.println("O livro '" + titulo + "' já está reservado.");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("O livro '" + titulo + "' foi devolvido com sucesso.");
        } else {
            System.out.println("O livro '" + titulo + "' já está disponível.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }
}

