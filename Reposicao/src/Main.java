public class Main {
    public static void main(String[] args) {
        Guarda g = new Guarda();
        g.setNome("Tadeu");
        g.setIdade(30);
        g.setHonra(3);
        g.setCoragem(5);
        g.orar();
        g.fazerPatrulha();
        g.mostraInfo();
        System.out.println("---------------");

        Cavaleiro c = new Cavaleiro();
        c.setNome("Armando");
        c.setIdade(25);
        c.setHonra(10);
        c.setCasa("teste");
        c.setNomeEscudeiro("Fulano");
        c.orar();
        c.fazerPatrulha();
        c.consagrarCavalheiro();
        c.mostraInfo();
        System.out.println("----------------");

        Lorde l = new Lorde();
        l.setNome("Ciclano");
        l.setIdade(40);
        l.setHonra(6);
        l.setCasa("teste2");
        l.orar();
        l.consagrarCavalheiro();
        l.mostraInfo();

    }
}