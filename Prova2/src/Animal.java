public abstract class Animal {
    public int qtdAnimais;
    private String nome;
    private int idade;
    private boolean perigoso;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }
    public boolean isPerigoso() {
        return perigoso;
    }
    public void mostraInfo(){
        System.out.println("Nome do animal: "+nome);
        System.out.println("Idade animal: "+idade);
        System.out.println("Perigoso: "+perigoso);
        qtdAnimais++;
        System.out.println("quantidade de Animais: "+qtdAnimais);
    }


    public abstract void barulho();

}
