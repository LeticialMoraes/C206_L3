package exercicio1.model;

public class Calculadora {
    public float x;
    public float y;

    public float soma(float r){
        float result; 
        result = x + y;
        return result;
    }
    public float subtracao(float r){
        float result;
        result = x - y;
        return result;
    }
    public float multiplicacao(float r){
        float result;
        result = x * y;
        return result;
    }
    public float divisao(float r){
        float result;
        result = x / y;
        return result;
    }

}
