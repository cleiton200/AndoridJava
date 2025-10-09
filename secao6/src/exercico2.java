import java.util.Scanner;
public class exercico2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escreva alguma coisa!!");
        String palavra = escaner.nextLine();

        int tamanhoPalavra = palavra.length();

        System.out.println("O tamanho da palavra que você digitou eh de :" + tamanhoPalavra);
    }
}
