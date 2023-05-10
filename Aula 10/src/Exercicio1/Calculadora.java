package Exercicio1;

public class Calculadora {
    private float x;
    private float y;

    public Calculadora(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float getY() {
        return y;
    }

    public float soma(){
        return x+y;
    }
    public float subtracao(){
        return x -y;
    }
    public float multiplicacao()throws ArithmeticException{
        return x*y;
    }
    public float divisao() throws ArithmeticException{
        return x/y;
    }
}
