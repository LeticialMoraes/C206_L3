package model;

public class Diretor{
    public String nome;
    public String cpf;
    public int idade;

    public Diretor(){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        Faculdade faculdade = new Faculdade();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Idade: "+idade);
    }
}
