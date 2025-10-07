import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual numero você calça?");
        int numero  = entrada.nextInt();

        System.out.println("Qual a população da sua cidade?");
        int populacao  = entrada.nextInt();

        System.out.printf("O seu nome é %s, o tamanho que você calça é %d, e a população da sua cidade é %d ",nome,numero,populacao);
    }
}
