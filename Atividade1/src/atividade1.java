import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float imc;
        float peso;
        float altura;

        System.out.println("Digite seu peso: ");
        peso = sc.nextFloat();

        System.out.println("Digite a sua altura: ");
        altura = sc.nextFloat();

        imc = (peso/(altura*altura));

        if(imc<18.5){
            System.out.println("Abaixo do peso");
        }
        else if(imc>=18.6 && imc<24.9){
            System.out.println("Peso Ideal(Parabens)");
        }
        else if(imc>=25.0 && imc<29.9){
            System.out.println("Levemente acima do peso");
        }
        else if(imc>=30.0 && imc<34.9){
            System.out.println("Obesidade grau I");
        }
        else if(imc>=35.0 && imc<39.9){
            System.out.println("Obesidade grau II(Severa)");
        }
        else{
            System.out.println("Obesidade grau III(Morbida)");
        }
    }
}
