public class Coruja extends Animal implements Alimentacao{
    private String cor;

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }


    @Override
    public void mostraInfo() {
        System.out.println("Cor: "+cor);
    }

    @Override
    public void barulho() {
        System.out.println("A coruja faz barulho");
    }

    @Override
    public void comendo() {
        System.out.println("A coruja esta comendo");
    }
}
