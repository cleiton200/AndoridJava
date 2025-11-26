package funcionalidade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class leituraDeDados {
    public static void main(String[] args) {
        File arquivo = new File("secao17/src/dados/data");

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                for (String valor : dados) {
                    System.out.print(valor + " | ");
                }
                System.out.println(); // Quebra de linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
