public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo(){
        System.out.println("O codigo da serie é: "+codigoSerie);
        System.out.println("O codigo do produto  é: "+codigoProduto);
        System.out.println("O nome do produto é: "+nome);
        System.out.println("A quantidade é: "+quantidade);
    }
}
