import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite o valor de milha que você deseja converter: ");
        float milha = scanner.nextInt();

        exercicio4 bah = new exercicio4();

        System.out.println("O valor dessa milha convetido é de:  " + bah.milhaKm(milha)+" KM");
    }


    private float milhaKm(float milha){
        float valorConvertido = (float) 1.6 * milha;
        return valorConvertido;
    }
}
