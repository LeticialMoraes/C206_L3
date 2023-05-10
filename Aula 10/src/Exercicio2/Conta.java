package Exercicio2;
public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;


    public Conta(int numero, String nome, double saldo, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void deposita(double valor){
        saldo += valor;
    }

    public double sacar(float quantia) throws SaldoInsuficienteException {

        if(quantia <= saldo) {
            this.saldo -= quantia;
        }else {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        return saldo;
    }

    public void mostraInfo() {
        System.out.println("Numero da conta: "+numero);
        System.out.println("Nome: "+nome);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
}
