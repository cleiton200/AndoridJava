import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual numero vc quer descobrir o cubo?");
        int num = scanner.nextInt();

        exercicio3 calcCubo = new exercicio3();

        System.out.println("o cubo deste numero é: " + calcCubo.CalcularCubo(num));

    }

    private int CalcularCubo(int num){
        return num*num*num;
    }
}
