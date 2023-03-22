public class Empresa {
    String cnpj;
    String endereco;
    Contato[] contatos = new Contato[3];

    void exibirInfos(){
        System.out.println("O cnpj da Empresa é: "+cnpj);
        System.out.println("O endereco da Empresa é: "+endereco);
        for(int i = 0; i< contatos.length; i++){
            if(contatos[i] != null){
                System.out.println("Nome: " + contatos[i].nome);
                System.out.println("Email: " + contatos[i].email);
                System.out.println("Telefone: " + contatos[i].telefone);
                System.out.println("Data de nascimento: " + contatos[i].dataNascimento);
            }
        }
    }
}
