package dia08.Desafio08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/test.txt"));
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch(IOException e) {
            System.out.println("Não foi possível leitura!");
        } finally {
            System.out.println("Terminado com sucesso!");
        }
    }
}
