package Exercicio1;

public class Turma {
    private String nomeTurma;
    private Professor professor;
    private Aluno[] alunos;
    private int posicaoAtual = 0;

    public Turma(Professor professor, String nomeTurma, int numeroVagas) {
        this.professor = professor;
        this.nomeTurma = nomeTurma;
        alunos = new Aluno[numeroVagas];
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public void inserirAluno(Aluno aluno){
        alunos[posicaoAtual] = aluno;
        posicaoAtual++;
    }

    public void listarAlunos(){
        for(int i=0; i < posicaoAtual; i++){
            System.out.println("Aluno" + (i+1) + ": " + alunos[i].getNome());
        }
    }
}
