public class Main {
    public static void main(String[] args) {
        Carrinho c = new Carrinho();


        c.produtos[0] = new Produto();
        c.produtos[0].nome = "Detergente";
        c.produtos[0].preco = 3.90;
        c.produtos[0].fabricante = "Ype";
        c.produtos[0].descricao = "Detergente incolor neutro";

        Produto p = new Produto();
        p.nome = "Sabao em po";
        p.preco = 15;
        p.fabricante = "Tixan Ype";
        p.descricao = "Limpeza e cuidado com as roupas";

        c.produtos[1] = p;

        Produto p2 = new Produto();
        p2.nome = "Pasta de dente";
        p2.preco = 2.35;
        p2.fabricante = "Colgate";
        p2.descricao = "12 horas de defesa ativa contra bacterias";

        c.produtos[2] = p2;

        c.exibirInfos();
        System.out.println(c.calculaTotal());


    }
}