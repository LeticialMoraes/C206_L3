package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        double area;
        double volume;

        area = c.circunferencia(5);
        volume = c.volume(6);

        System.out.println("A area é: "+area);
        System.out.println("O volume é: "+volume);
    }
}