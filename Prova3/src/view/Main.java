package view;
import controller.Arquivo;
import model.Professores;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arquivo arq = new Arquivo();
        Professores p = new Professores();
        boolean flag = true;

        while (flag) {
            System.out.println("Digite sua opção: ");
            System.out.println("1 - Adicionar Professor");
            System.out.println("2 - Ler Arquivo");
            System.out.println("3 - Remover Professor");
            System.out.println("4 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    try {
                        System.out.println("Professor");
                        System.out.println("Digite o nome: ");
                        p.nome = sc.nextLine();
                        System.out.println("Digite o CPF: ");
                        p.cpf = sc.nextLine();
                        System.out.println("Digite a materia: ");
                        p.materia = sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println(e);
                        System.out.println("Entrada incorreta. Por favor, insira um número inteiro para a quantidade.");
                        System.out.println("Professor");
                        System.out.println("Digite o nome: ");
                        p.nome = sc.nextLine();
                        System.out.println("Digite o CPF: ");
                        p.cpf = sc.nextLine();
                        System.out.println("Digite a materia: ");
                        p.materia = sc.nextLine();
                    }
                    arq.escrever(p);
                    break;
                case 2:
                    ArrayList<Professores> prof = arq.ler();
                    for (int i = 0; i < prof.size(); i++) {
                        System.out.println("Nome: " +prof.get(i).nome);
                        System.out.println("CPF: " +prof.get(i).cpf);
                        System.out.println("Materia: " +prof.get(i).materia);
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do Professor que deseja remover");
                    p.nome = sc.nextLine();
                    System.out.println("Digite a materia do professor que deseja remover: ");
                    p.materia = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Digite o CPF do professor que deseja remover: ");
                    p.cpf = sc.nextLine();
                    arq.remover(p);
                    break;
                case 4:
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
