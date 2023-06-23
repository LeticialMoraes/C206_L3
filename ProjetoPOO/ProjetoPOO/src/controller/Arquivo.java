package controller;

import model.Aluno;
import model.Diretor;
import model.Faculdade;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Arquivo {
    public void escrever(Faculdade facul){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            os = new FileOutputStream("Instituicao.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.write("Faculdade");
            bw.newLine();
            bw.write(facul.nome+ "\n");
            bw.write(facul.cnpj + "\n");
            bw.write(facul.cursos+ "\n");

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
    public void escreve(Diretor diretor){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            os = new FileOutputStream("Instituicao.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.write("Diretor");
            bw.newLine();
            bw.write(diretor.nome+ "\n");
            bw.write(diretor.cpf+ "\n");
            bw.write(diretor.idade+ "\n");
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
    public void escrevendo(Aluno aluno){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            os = new FileOutputStream("Instituicao.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.write("Aluno");
            bw.newLine();
            bw.write(aluno.nome+ "\n");
            bw.write(aluno.cpf+ "\n");
            bw.write(aluno.idade+ "\n");
            bw.write(aluno.curso+ "\n");
            bw.write(aluno.matricula+ "\n");
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

    public ArrayList<Faculdade> le(){
        ArrayList<Faculdade> faculdades = new ArrayList<>();
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{
            is = new FileInputStream("Instituicao.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){

                if(linhaLer.contains("Faculdade")){
                    Faculdade f = new Faculdade();
                    f.nome = br.readLine();
                    f.cnpj = br.readLine();
                    f.cursos = br.readLine();
                    faculdades.add(f);
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
        return faculdades;
    }
    public ArrayList<Diretor> ler(){
        ArrayList<Diretor> diretores = new ArrayList<>();
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{
            is = new FileInputStream("Instituicao.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){

                if(linhaLer.contains("Diretor")){
                    Diretor d = new Diretor();
                    d.nome = br.readLine();
                    d.cpf = br.readLine();
                    d.idade = Integer.parseInt(br.readLine());
                    diretores.add(d);
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
        return diretores;
    }
    public ArrayList<Aluno> lendo(){
        ArrayList<Aluno> Alunos = new ArrayList<>();
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{
            is = new FileInputStream("Instituicao.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){

                if(linhaLer.contains("Alunos")){
                    Aluno a = new Aluno();
                    a.nome = br.readLine();
                    a.cpf = br.readLine();
                    a.idade = Integer.parseInt(br.readLine());
                    a.curso= br.readLine();
                    a.matricula = Integer.parseInt(br.readLine());
                    Alunos.add(a);
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
        return Alunos;
    }
    public void remover(Faculdade facul) {
        ArrayList<Faculdade> faculdades = this.le();
        Iterator<Faculdade> iterator = faculdades.iterator();
        while (iterator.hasNext()) {
            Faculdade f = iterator.next();
            if (f.cnpj.equals(facul.cnpj)) {
                iterator.remove();
                System.out.println("Faculdade removida!");
                break;
            }
        }
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Instituicao.txt", false);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            for (Faculdade f: faculdades) {
                bw.write("Faculdade");
                bw.newLine();
                bw.write(f.nome+ "\n");
                bw.write(f.cnpj + "\n");
                bw.write(f.cursos+ "\n");
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
    public void remove(Diretor diretor) {
        ArrayList<Diretor> diretores = this.ler();
        Iterator<Diretor> iterator = diretores.iterator();
        while (iterator.hasNext()) {
            Diretor d = iterator.next();
            if (d.cpf.equals(diretor.cpf)) {
                iterator.remove();
                System.out.println("Diretor removido!");
                break;
            }
        }
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Instituicao.txt", false);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            for (Diretor d : diretores) {
                bw.write("Diretor");
                bw.newLine();
                bw.write(d.nome+ "\n");
                bw.write(d.cpf+ "\n");
                bw.write(d.idade+ "\n");
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
    public void removendo(Aluno aluno) {
        ArrayList<Aluno> alunos = this.lendo();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            Aluno a = iterator.next();
            if (a.cpf.equals(aluno.cpf)) {
                iterator.remove();
                System.out.println("Aluno removido!");
                break;
            }
        }
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Instituicao.txt", false);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            for (Aluno a : alunos) {
                bw.write("Aluno");
                bw.newLine();
                bw.write(a.nome+ "\n");
                bw.write(a.cpf+ "\n");
                bw.write(a.idade+ "\n");
                bw.write(a.curso+ "\n");
                bw.write(a.matricula+ "\n");
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