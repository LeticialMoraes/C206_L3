import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        float x;
        float y;
        float result;

        System.out.println("Digite os valores: ");
        x = sc.nextFloat();
        y = sc.nextFloat();
        System.out.println("Escolha uma das opcoes: ");
        System.out.println("1 - para soma: ");
        System.out.println("2 - para subtracao: ");
        System.out.println("3 - para multiplicação: ");
        System.out.println("4 - para divisao: ");

        op = sc.nextInt();
        switch (op){
            case 1:
                result = x+y;
                System.out.println("O resultado e: "+result);
                break;
            case 2:
                result = x-y;
                System.out.println("O resultado e: "+result);
                break;
            case 3:
                result = x*y;
                System.out.println("O resultado e: "+result);
                break;
            case 4:
                result = x/y;
                System.out.println("O resultado e: "+result);
                break;
        }
        sc.close();
    }

}