public class Alunos {
    String nome;
    int matricula;
    String curso;
    Faculdade facul;
    Materias[] materias = new Materias[4];

    void exibirInfos() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null) {
                System.out.println("Nome da materia: " + materias[i].nome);
                System.out.println("Sigla: " + materias[i].sigla);
                System.out.println("Creditos: " + materias[i].creditos);
            }
        }
    }
   /* int totalCreditos(){
        for(int i = 0; i < materias.length; i++) {
            if (materias[i] != null) {
                materias[i].creditos += materias[i].creditos;
            }
        }

        return ;
    }*/
}