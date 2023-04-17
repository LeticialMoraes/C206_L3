package Exercicio1;

public class Main {
    public static void main(String[] args) {
        SUV suv = new SUV();
        Sedan sedan = new Sedan();
        Hatch hatch = new Hatch();

        suv.setValor(60000);
        suv.setCor("Prata");
        suv.setAno(2008);
        suv.setTracao("20");
        suv.taxa();
        suv.mostraInfo();
        System.out.println("--------------");

        sedan.setValor(75000);
        sedan.setCor("Vermelho");
        sedan.setAno(2010);
        sedan.setPortaMalas(1);
        sedan.taxa();
        sedan.mostraInfo();
        System.out.println("--------------");

        hatch.setValor(90000);
        hatch.setCor("Azul");
        hatch.setAno(2015);
        hatch.setPortas(4);
        hatch.taxa();
        hatch.mostraInfo();
        System.out.println("--------------");

    }
}