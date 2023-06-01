package controller;
import model.Professores;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


public class Arquivo {

    public void escrever(Professores prof){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            os = new FileOutputStream("Professores.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // escrevendo os valores usando bw:
            bw.write("Professores");
            bw.newLine();
            bw.write(prof.nome + "\n");
            bw.write(prof.cpf + "\n");
            bw.write(prof.materia + "\n");
            bw.write("----------------");
            bw.write("\n");
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


    public ArrayList<Professores> ler() {
        ArrayList<Professores> professores = new ArrayList<>();
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try {
            is = new FileInputStream("Professores.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while (linhaLer != null) {

                if (linhaLer.contains("Professores")) {
                    Professores p = new Professores();
                    p.nome = br.readLine();
                    p.cpf = br.readLine();
                    p.materia = br.readLine();
                    professores.add(p);
                }
                linhaLer = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return professores;
    }

    public void remover(Professores prof) {
        ArrayList<Professores> professores = ler();
        Iterator<Professores> iterator = professores.iterator();
        while (iterator.hasNext()) {
            Professores p = iterator.next();
            if (p.cpf.equals(prof.cpf)) {
                iterator.remove();
                System.out.println("Professor removido!");
                break;
            }
        }
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Professores.txt", false); // Sobrescreve o arquivo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            for (Professores p : professores) {
                bw.write("Professor");
                bw.newLine();
                bw.write(p.nome + "\n");
                bw.write(p.cpf + "\n");
                bw.write(p.materia + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}