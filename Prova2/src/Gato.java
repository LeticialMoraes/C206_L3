public class Gato extends Animal implements Alimentacao{
    private String raca;

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Raca: "+raca);
    }

    @Override
    public void barulho() {
        System.out.println("O gato faz barulho");
    }

    @Override
    public void comendo() {
        System.out.println("O gato esta comendo");
    }
}
