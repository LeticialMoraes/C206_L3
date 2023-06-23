package model;

public class Faculdade {
    public String nome;
    public String cnpj;
    public String cursos;
    private static int qtdAlunos;

    Aluno a;

    public void addAluno(Aluno aluno){
        this.a = aluno;
        qtdAlunos++;
    }

    public static int getQtdAlunos() {
        return qtdAlunos;
    }
    public static void setQtdAlunos(int qtdAlunos) {
        Faculdade.qtdAlunos = qtdAlunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
    public String getCursos() {
        return cursos;
    }
    public Faculdade(){
        this.nome = nome;
        this.cnpj = cnpj;
        this.cursos = cursos;
    }

}
