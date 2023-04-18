public class Lorde extends Pessoa implements Consagra{
    private String casa;
    private int qtdVassalos;

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getCasa() {
        return casa;
    }

    public int getQtdVassalos() {
        return qtdVassalos;
    }

    @Override
    public void mostraInfo(){
        System.out.println("Casa: " +casa);
        System.out.println("Quantidade de vassalos: "+qtdVassalos);

    }
    @Override
    public void orar() {
        System.out.println(getNome()+ " fez uma oração aos sete deuses");
    }

    @Override
    public void consagrarCavalheiro() {
        System.out.println(getNome() + " consagrou  um  novo cavaleiro");
        qtdVassalos++;
    }
}
