package Exercicio1;

public class Calculadora {
    double PI = 3.14;


    public double circunferencia(double raio){
        double a;
        a = PI * Math.pow(raio, 2);
        return a;
    }

    public double volume(double raio){
        double v;
        v = (4/3)* PI * Math.pow(raio, 3);
        return v;
    }
}
