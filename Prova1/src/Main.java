public class Main {
    public static void main(String[] args) {
        Faculdade faculdade = new Faculdade("Inatel", "123456");
        int total;

        Alunos a1 = new Alunos();
        Alunos a2 = new Alunos();

        a1.nome = "Leticia";
        a2.nome = "Ygor";

        a1.matricula = 352;
        a2.matricula = 123;

        a1.curso = "GES";
        a2.curso = "GEC";

        a1.materias[0] = new Materias("Programação Orientada a Objeto", "POO", 6);
        a2.materias[0] = new Materias("Calculo 3", "M003", 3);

        a1.materias[1] = new Materias("Banco de Dados", "C207", 4);
        a2.materias[1] = new Materias("Administração", "H002", 2);

        faculdade.exibirInfos();
        System.out.println("-----");
        a1.exibirInfos();
        System.out.println("-----");
        a2.exibirInfos();



    }
}