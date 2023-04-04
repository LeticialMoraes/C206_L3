package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Conta conta = new Conta();

        c1.setNome("Leticia");
        c1.setCpf(123456);

        conta.setClientes(c1);

        System.out.println(conta.getSaldo());
        conta.deposita(2000);
        System.out.println(conta.getSaldo());
        conta.sacar(150);
        System.out.println(conta.getSaldo());
        conta.sacar(2100);

    }
}
