public class Leao extends Animal{
    private float tamanhoJuba;

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }

    public float getTamanhoJuba() {
        return tamanhoJuba;
    }

    @Override
    public void mostraInfo() {
        System.out.println("tamanho da Juba: "+tamanhoJuba);
    }


    @Override
    public void barulho() {
        System.out.println("O Leao faz barulho");
    }
}
