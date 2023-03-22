import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Restaurante r1 = new Restaurante();

        r1.nome = "Porteira";
        r1.endereco = "Comendador Jose Garcia";
        r1.cnpj = "1234";

        r1.fornecedores[0] = new Fornecedor("Comida", 50);
        r1.fornecedores[1] = new Fornecedor("Mesa", 150);

        r1.exibirInfos();

    }
}