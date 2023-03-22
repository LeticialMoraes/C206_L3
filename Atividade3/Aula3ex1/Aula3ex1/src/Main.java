public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.codigoSerie = 0215;
        p2.codigoSerie = 2148;

        p1.codigoProduto = "Produto 1";
        p2.codigoProduto = "Produto 2";

        p1.nome = "Abacaxi";
        p2.nome = "Batom";

        p1.categoria = "Fruta";
        p2.categoria = "Cosmeticos";

        p1.quantidade = 3;
        p2.quantidade = 1;

        p1.mostraInfo();
        p2.mostraInfo();
    }
}