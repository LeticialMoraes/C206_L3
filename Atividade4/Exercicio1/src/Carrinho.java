public class Carrinho {
    double total;
    Produto[] produtos = new Produto[4];
    void exibirInfos() {
        for(int i=0;i<produtos.length;i++) {
            if(produtos[i] != null) {
                System.out.println("Informações do produto " + i + ": ");
                System.out.println("Nome: " + produtos[i].nome);
                System.out.println("Descricao: " + produtos[i].descricao);
                System.out.println("Fabricante: " + produtos[i].fabricante);
                System.out.println("Preco: " + produtos[i].preco);
            }
        }
    }
    double calculaTotal() {
        for(int i=0;i<produtos.length;i++) {
            if (produtos[i] != null) {
                total += produtos[i].preco;
            }
        }
        return total;
    }
}
