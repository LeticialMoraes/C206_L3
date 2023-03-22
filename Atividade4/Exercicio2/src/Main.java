public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.cnpj = "105789";
        empresa.endereco = "Rua 1";

        empresa.contatos[0] = new Contato("Leticia", "email@gmail.com", "92173108", "19/12/2000");
        empresa.contatos[1] = new Contato("Matheus", "teste@gmail.com", "01234567", "20/11/2002");

        empresa.exibirInfos();
    }
}