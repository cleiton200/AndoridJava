import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o valor em Celsius (Cº) que você deseja obter em Fahrenhit(Fº):");
        float valorC = scanner.nextInt();

        exercicio5 toConvertendo = new exercicio5();

        System.out.println("O valor digitado, em Fahrenhit(Fº) equivale à: " + toConvertendo.Converter(valorC)+ " Fº");

    }

    private float Converter(float valor){
        float valorF = (valor * 9 / 5 ) + 32;
        return valorF;
    }
}
