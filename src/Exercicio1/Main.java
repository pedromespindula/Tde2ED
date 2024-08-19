package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Pedro");
        pessoa1.setEmail("00pedrolucas00@gmail.com");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Email: " + pessoa1.getEmail());
        pessoa1.logar();

        Professor prof1 = new Professor("Juliano", "Juliano@gmail.com");
        prof1.logar();

        System.out.println("Professor: " + prof1.getNome());
        System.out.println("Email: " + prof1.getEmail());

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");
        aluno1.setEmail("pedroespindula@rede.ulbra.com");
        Aluno a2 = new Aluno();
        a2.setNome("ana");

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Email: "+ aluno1.getEmail());
        aluno1.logar();

        Turma estruturaDados = new Turma(prof1, "Estrutura de Dados" , 30);
        System.out.println(estruturaDados.getNomeTurma());
        estruturaDados.inserirAluno(aluno1);
        estruturaDados.inserirAluno(a2);
        estruturaDados.listarAlunos();

    }
}