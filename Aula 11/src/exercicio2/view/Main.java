package exercicio2.view;
import exercicio2.controller.Arquivo;
import exercicio2.model.Notebooks;
import exercicio2.model.Smartphone;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arquivo arq = new Arquivo();
        Notebooks n = new Notebooks();
        Smartphone s = new Smartphone();
        boolean flag = true;

        while (flag) {
            System.out.println("Digite sua opção: ");
            System.out.println("1 - Adicionar Notebook");
            System.out.println("2 - Adicionar Smartphone");
            System.out.println("3 - Ler Arquivo");
            System.out.println("4 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:

                    System.out.println("Notebook");
                    System.out.println("Digite a marca: ");
                    n.marca = sc.nextLine();
                    System.out.println("Digite o modelo: ");
                    n.modelo = sc.nextLine();
                    System.out.println("Digite a matricula do resposavel: ");
                    n.matResp = sc.nextInt();
                    System.out.println("Digite a serie: ");
                    n.serie = sc.nextInt();
                    arq.escrever(n);
                    break;
                case 2:
                    System.out.println("Smartphone");
                    System.out.println("Digite a marca: ");
                    s.marca = sc.nextLine();
                    System.out.println("Digite o modelo: ");
                    s.modelo = sc.nextLine();
                    System.out.println("IMEI: ");
                    s.imei = sc.nextLine();
                    System.out.println("Centro de custo: ");
                    s.custo = sc.nextFloat();
                    System.out.println("Digite a matricula do resposavel: ");
                    s.matResp = sc.nextInt();
                    arq.escreve(s);
                    break;

                case 3:

                    ArrayList<Notebooks> funcs = arq.le();
                    for (int i = 0; i < funcs.size(); i++) {
                        System.out.println("Marca: " +funcs.get(i).marca);
                        System.out.println("Modelo: " +funcs.get(i).modelo);
                        System.out.println("Serie: " +funcs.get(i).serie);
                        System.out.println("Matricula do Responsavel: " +funcs.get(i).matResp);
                    }

                    ArrayList<Smartphone> funcs1 = arq.ler();
                    for (int i = 0; i <funcs1.size(); i++) {
                        System.out.println("Marca: " +funcs1.get(i).marca);
                        System.out.println("Modelo: " +funcs1.get(i).modelo);
                        System.out.println("IMEI: " +funcs1.get(i).imei);
                        System.out.println("Centro de custo: " +funcs1.get(i).custo);
                        System.out.println("Matricula do Responsavel: " +funcs1.get(i).matResp);
                    }
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
    }
}
