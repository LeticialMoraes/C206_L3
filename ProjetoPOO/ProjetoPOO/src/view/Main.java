package view;
import controller.Arquivo;
import model.Faculdade;
import model.Aluno;
import model.Diretor;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arquivo arq = new Arquivo();
        Faculdade f = new Faculdade();
        Aluno a = new Aluno();
        Diretor d = new Diretor();
        boolean flag = true;

        while (flag) {
            System.out.println("Digite sua opção: ");
            System.out.println("1 - Adicionar uma Faculdade, um Diretor e um Aluno");
            System.out.println("2 - Ler Arquivo");
            System.out.println("3 - Remover uma Faculdade");
            System.out.println("4 - Remover um Diretor");
            System.out.println("5 - Remover um Aluno");
            System.out.println("6 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Faculdade");
                    System.out.println("Digite o nome: ");
                    f.nome = sc.nextLine();
                    System.out.println("Digite o CNPJ: ");
                    f.cnpj = sc.nextLine();
                    System.out.println("Digite um cursos: ");
                    f.cursos = sc.nextLine();
                    arq.escrever(f);

                    System.out.println("------------------------");
                    System.out.println("Diretor");
                    System.out.println("Digite o Nome: ");
                    d.nome = sc.nextLine();
                    System.out.println("Digite o CPF: ");
                    d.cpf = sc.nextLine();
                    System.out.println("Digite a Idade: ");
                    d.idade = sc.nextInt();
                    arq.escreve(d);

                    System.out.println("------------------------");
                    System.out.println("Aluno");
                    sc.nextLine();
                    System.out.println("Digite o Nome: ");
                    a.nome = sc.nextLine();
                    System.out.println("Digite o CPF: ");
                    a.cpf = sc.nextLine();
                    System.out.println("Digite a Idade: ");
                    a.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o curso: ");
                    a.curso = sc.nextLine();
                    System.out.println("Digite a matricula: ");
                    a.matricula = sc.nextInt();
                    arq.escrevendo(a);
                    break;

                case 2:
                    ArrayList<Faculdade> funcs = arq.le();
                    System.out.println("Faculdade");
                    for (int i = 0; i < funcs.size(); i++) {
                        System.out.println("Nome: " +funcs.get(i).nome);
                        System.out.println("CNPJ: " +funcs.get(i).cnpj);
                        System.out.println("Curso: " +funcs.get(i).cursos);
                    }

                    ArrayList<Diretor> funcs1 = arq.ler();
                    System.out.println("----------------");
                    System.out.println("Diretor");
                    for (int i = 0; i <funcs1.size(); i++) {
                        System.out.println("Nome: " +funcs1.get(i).nome);
                        System.out.println("CPF: " +funcs1.get(i).cpf);
                        System.out.println("Idade: " +funcs1.get(i).idade);
                    }

                    ArrayList<Aluno> funcs2 = arq.lendo();
                    System.out.println("----------------");
                    System.out.println("Aluno");
                    for (int i = 0; i <funcs2.size(); i++) {
                        System.out.println("Nome: " +funcs2.get(i).nome);
                        System.out.println("CPF: " +funcs2.get(i).cpf);
                        System.out.println("Idade: " +funcs2.get(i).idade);
                        System.out.println("Matricula: " +funcs2.get(i).matricula);
                        System.out.println("Curso: " +funcs2.get(i).curso);
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome da faculdade que deseja remover");
                    f.nome = sc.nextLine();
                    System.out.println("Digite o cnpj da faculdade que deseja remover: ");
                    f.cnpj = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Digite o curso que deseja remover: ");
                    f.cursos = sc.nextLine();
                    arq.remover(f);
                    break;
                case 4:
                    System.out.println("Digite o nome do Diretor que deseja remover");
                    d.nome = sc.nextLine();
                    System.out.println("Digite o cpf do diretor que deseja remover: ");
                    d.cpf = sc.nextLine();
                    System.out.println("Digite a idade do diretor que deseja remover remover: ");
                    d.idade = sc.nextInt();
                    arq.remove(d);
                    break;
                case 5:
                    System.out.println("Digite o nome do aluno que deseja remover");
                    a.nome = sc.nextLine();
                    System.out.println("Digite o cpf do aluno que deseja remover: ");
                    a.cpf = sc.nextLine();
                    System.out.println("Digite a idade do aluno que deseja remover remover: ");
                    a.idade = sc.nextInt();
                    System.out.println("Digite a matricula do aluno que deseja remover: ");
                    a.matricula = sc.nextInt();
                    System.out.println("Digite o curso do aluno que deseja remover remover: ");
                    a.curso = sc.nextLine();
                    arq.removendo(a);
                    break;
                case 6:
                    flag = false;
                    System.out.println("Você saiu!");
                    break;

                default:
                    System.out.println("opção inválida!");
                    break;
            }
        }
        sc.close();
    }
}