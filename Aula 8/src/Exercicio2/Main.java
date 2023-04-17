package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Geladeira g = new Geladeira();
        Fogao f = new Fogao();
        g.setCodigo(123);
        g.setDescricao("Geladeira");
        g.setTamanho(15);
        g.setQuantidadePortas(3);
        g.setTipo("Inox");
        g.setFabricante("Eletrolux");
        g.setValor(2000);
        

        f.setDescricao("Fogao");
        f.setQuantidadeBocas(4);
        f.setCodigo(321);
        f.setFabricante("Eletrolux");
        f.setValor(2000);
        f.setTipoAcendimento("manual");
       
    }
}
