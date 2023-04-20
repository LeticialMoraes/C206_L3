public class Zoo {
    private String nome;
    private String endereco;
    private long cnpj;
    Animal animal[] = new Animal[3];

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    public long getCnpj() {
        return cnpj;
    }

    public void mostraInfo(){
        System.out.println("Nome do zoologico: "+nome);
        System.out.println("Endereco do zoologico: "+endereco);
        System.out.println("Cnpj: "+cnpj);
        for(int i = 0;i<animal.length;i++) {
            if (animal[i] != null) {
                System.out.println("Animal: "+animal[i].qtdAnimais);
            }
        }
    }
}
