/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARQUIVO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author DivinoM
 */
public class ARQUIVO {

    /**
     * @param args the command line arguments
     */
    
    public static void CriarArquivo(String arquivo) throws IOException{
        FileWriter file = new FileWriter(arquivo, true);
    }
    
    public static void EscreverArquivo(String arquivo, String texto) throws FileNotFoundException, IOException{
        OutputStream os = new FileOutputStream(arquivo, true);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(texto);
        bw.newLine();
        bw.close();
    }
    
    public static void LerArquivo(String arquivo) throws FileNotFoundException, IOException{
        InputStream is = new FileInputStream(arquivo);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        
        while (s!=null){
            System.out.println(s);
            s = br.readLine();
        }
        br.close();
    }
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    	Scanner ler = new Scanner(System.in);
    	int numero = 1;
    	  
        CriarArquivo("arquivo_ex1.txt");
        

        System.out.println("Para parar o programa digite o numero (0)!!");
        EscreverArquivo("arquivo_ex1.txt", "*******NUMEROS ARMAZENADOS******");

        do{

          System.out.print("Informe um numero:");
          numero = ler.nextInt();

          EscreverArquivo("arquivo_ex1.txt","|"+numero+"|");
        }while(numero != 0);
        
        System.out.println("PROGRAMA FINALIZADO NUMERO (0) DIGITADO!!!");

        
        
        LerArquivo("arquivo_ex1.txt");
    }
    
}
