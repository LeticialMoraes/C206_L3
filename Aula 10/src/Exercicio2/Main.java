package Exercicio2;

import Exercicio2.Conta;

public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta[] c = new Conta[2];
        c[0] = new Conta(123456, "Leticia", 100, 50);
        c[1] = new Conta(34567, "Fulano", 50, 50);
        c[0].deposita(50);
        c[1].deposita(500);

        try {
            c[0].sacar(300);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }


        try {
            c[1].sacar(300);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }



    }
}