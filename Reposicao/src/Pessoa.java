public abstract class Pessoa {
    public static int qtdPessoas;
    private String nome;
    private int idade;
    private int honra;
    Arma arma[] = new Arma[2];

    public static void setQtdPessoas(int qtdPessoas) {
        Pessoa.qtdPessoas = qtdPessoas;
    }
    public Pessoa(){
        qtdPessoas++;
    }

    public void setArma(Arma[] arma) {
        this.arma = arma;
    }

    public Arma[] getArma() {
        return arma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setHonra(int honra) {
        this.honra = honra;
    }
    public int getHonra() {
        return honra;
    }


    public void mostraInfo(){
        System.out.println("Quantidade de pessoas: "+qtdPessoas);
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Honra: "+honra);
        for(int i = 0;i<arma.length;i++) {
            if (arma[i] != null) {
                System.out.println("A pessoa possui arma: "+arma[i]);
            }else {
                System.out.println("Não possui arma");
            }
        }
    }

     public abstract void orar();
}
