public class Faculdade {
    String nome;
    String cnpj;

    public Faculdade(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }
    void exibirInfos(){
        System.out.println("Nome da faculdade: "+nome);
        System.out.println("CNPJ: "+cnpj);
    }
}
