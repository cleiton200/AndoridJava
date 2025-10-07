import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual a base do retangulo?");
        float base = entrada.nextFloat();

        System.out.println("Qual a altura do retangulo?");
        float altura = entrada.nextFloat();
         
        float area = base * altura;

        System.out.printf("A area do triangulo é de %.2f",area);
    }
}
