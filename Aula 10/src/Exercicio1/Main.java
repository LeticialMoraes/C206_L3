package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora(10, 0);

        try{
            c.soma();
            c.subtracao();
            c.multiplicacao();
            c.divisao();
        }catch (ArithmeticException e){
            System.out.println("Erro: "+e);

        }
    }
}
