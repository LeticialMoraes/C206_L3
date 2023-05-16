package exercicio1.controller;
import exercicio1.model.Calculadora;
import java.util.Iterator;
import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    float r;
    public void escrever(Calculadora calc) {

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;
        try {
            os = new FileOutputStream("Calculadora.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Calcualdora");
            bw.newLine();
            bw.write(calc.x + "\n");
            bw.write(calc.y + "\n");
            bw.write(calc.x + " + "+ calc.y +" = " +calc.soma(r) +"\n");
            bw.write(calc.x + " - "+ calc.y +" = " +calc.subtracao(r)+"\n");
            bw.write(calc.x + " * "+ calc.y +" = " +calc.multiplicacao(r)+"\n");
            bw.write(calc.x + " / "+ calc.y +" = " +calc.divisao(r)+"\n");
            bw.newLine();

        }catch(Exception e){
            System.out.println(e);
        }finally {
            try {
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public ArrayList<Calculadora> ler(){
        ArrayList<Calculadora> calc1 = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{

            is = new FileInputStream("Calculadora.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){

                if(linhaLer.contains("Funcionario")){
                    Calculadora c = new Calculadora();
                    c.x = Float.parseFloat(br.readLine());
                    c.y = Float.parseFloat(br.readLine());
                    calc1.add(c);
                    System.out.println(c.x + " + "+ c.y +" = " +c.soma(r));
                    System.out.println(c.x + " - "+ c.y +" = " +c.subtracao(r));
                    System.out.println(c.x + " * "+ c.y +" = " +c.multiplicacao(r));
                    System.out.println(c.x + " / "+ c.y +" = " +c.divisao(r));
                }
                linhaLer = br.readLine();
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return calc1;
    }
}
