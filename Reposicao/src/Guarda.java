public class Guarda extends Pessoa implements Patrulha{

    private int coragem;

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

    public int getCoragem() {
        return coragem;
    }

    @Override
    public void mostraInfo(){
        System.out.println("Coragem: " +coragem);

    }

    @Override
    public void orar() {
        System.out.println(getNome() + " fez uma oração aos deuses antigos");
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(getNome()+" fez uma patrulha além da muralha");
        setCoragem(20);
    }
}
