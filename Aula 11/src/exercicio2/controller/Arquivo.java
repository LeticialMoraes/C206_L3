package exercicio2.controller;
import exercicio2.model.Notebooks;
import exercicio2.model.Smartphone;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
public class Arquivo {
    public void escrever(Notebooks note){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            os = new FileOutputStream("Empresa.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.write("Notebook");
            bw.newLine();
            bw.write(note.marca + "\n");
            bw.write(note.modelo + "\n");
            bw.write(note.matResp + "\n");
            bw.write(note.serie + "\n");
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
    public void escreve(Smartphone smart){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            os = new FileOutputStream("Empresa.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.write("Notebook");
            bw.newLine();
            bw.write(smart.marca+ "\n");
            bw.write(smart.modelo+ "\n");
            bw.write(smart.custo+ "\n");
            bw.write(smart.imei+ "\n");
            bw.write(smart.matResp+ "\n");
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

    public ArrayList<Notebooks> le(){
        ArrayList<Notebooks> notebooks = new ArrayList<>();
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{
            is = new FileInputStream("Empresa.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){

                if(linhaLer.contains("Notebook")){
                    Notebooks n = new Notebooks();
                    n.marca = br.readLine();
                    n.modelo = br.readLine();
                    n.serie = Integer.parseInt(br.readLine());
                    n.matResp = Integer.parseInt(br.readLine());
                    notebooks.add(n);
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
        return notebooks;
    }

    public ArrayList<Smartphone> ler(){
        ArrayList<Smartphone> smartphones = new ArrayList<>();
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{
            is = new FileInputStream("Empresa.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){

                if(linhaLer.contains("Smartphone")){
                    Smartphone s = new Smartphone();
                    s.marca = br.readLine();
                    s.modelo = br.readLine();
                    s.custo = Integer.parseInt(br.readLine());
                    s.imei = br.readLine();
                    s.matResp = Integer.parseInt(br.readLine());
                    smartphones.add(s);
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
        return smartphones;
    }

}
