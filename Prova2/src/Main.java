public class Main {
    public static void main(String[] args) {
        Zoo z = new Zoo();

        z.setNome("Zoo");
        z.setEndereco("Rua 1");
        z.setCnpj(0234565);

        Coruja c = new Coruja();
        c.setNome("Coruja");
        c.setIdade(6);
        c.setCor("Branco");
        c.setPerigoso(true);
        z.animal[0] = c;

        Gato g = new Gato();
        g.setNome("Gato");
        g.setIdade(1);
        g.setRaca("Viralata");
        g.setPerigoso(false);
        z.animal[1] = g;

        Leao l = new Leao();
        l.setNome("Leao");
        l.setIdade(13);
        l.setTamanhoJuba(3.5F);
        l.setPerigoso(true);
        z.animal[2] = l;

        z.mostraInfo();

    }
}