public class Cavaleiro extends Pessoa implements Patrulha, Consagra{

    private String casa;
    private String nomeEscudeiro;
    Montaria montaria[] = new Montaria[3];

    public void setCasa(String casa) {
        this.casa = casa;
    }
    public String getCasa() {
        return casa;
    }

    public void setNomeEscudeiro(String nomeEscudeiro) {
        this.nomeEscudeiro = nomeEscudeiro;
    }
    public String getNomeEscudeiro() {
        return nomeEscudeiro;
    }

    public void setMontaria(Montaria[] montaria) {
        this.montaria = montaria;
    }

    public Montaria[] getMontaria() {
        return montaria;
    }

    @Override
    public void mostraInfo(){
        System.out.println("Casa: " +casa);
        System.out.println("Nome do escudeiro: "+nomeEscudeiro);
        for(int i = 0;i<montaria.length;i++) {
            if (montaria[i] != null) {
                System.out.println("A pessoa possui arma: "+montaria[i]);
            }
            else{
                System.out.println("Nao possui montaria");
            }
        }

    }
    @Override
    public void orar() {
        System.out.println(getNome() + " fez uma oração o deus do fogo");
    }

    @Override
    public void consagrarCavalheiro() {
        System.out.println(getNome()+" consagrou um novo cavaleiro");
        setHonra(5);
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(getNome()+" fez uma patrulha pelo reino");
    }
}
