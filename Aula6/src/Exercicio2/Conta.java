package Exercicio2;

public class Conta {
    private int qtdClientes;
    private double saldo;
    private Cliente clientes;

    public void sacar(double valor){
        if(saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
    public Cliente getClientes() {
        return clientes;
    }

}
