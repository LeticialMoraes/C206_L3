package exercicio1.view;

import exercicio1.controller.Arquivo;
import exercicio1.model.Calculadora;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float r = 0;
        Scanner sc = new Scanner(System.in);
        Arquivo arq = new Arquivo();
        Calculadora calculadora = new Calculadora();
        System.out.println("Digite um numero: ");
        calculadora.x = sc.nextFloat();
        System.out.println("Digite outro numero: ");
        calculadora.y = sc.nextFloat();
        arq.escrever(calculadora);

        ArrayList<Calculadora> funcs = arq.ler();
        for (int i = 0; i< funcs.size(); i++)
        {
            System.out.println(calculadora.x + " + "+ calculadora.y +" = " + funcs.get(i).soma(r));
            System.out.println(calculadora.x + " - "+ calculadora.y +" = " + funcs.get(i).subtracao(r));
            System.out.println(calculadora.x + " * "+ calculadora.y +" = " + funcs.get(i).multiplicacao(r));
            System.out.println(calculadora.x + " / "+ calculadora.y +" = " + funcs.get(i).divisao(r));
        }

    sc.close();
    }

}