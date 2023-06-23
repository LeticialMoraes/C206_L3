package model;

public class Aluno extends Diretor{
    public int matricula;
    public String curso;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }


}
