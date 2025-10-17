import java.util.Scanner;

public class exercicios {

    private void exercicioA(int i) {
        for (i = 0; i <= 50; i++) {
            System.out.print(i + " ");
        }
    }

    private void exercicioB(int i) {
        for (i = 50; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    private void exercicioC(int i) {
        for (i = 0; i <= 50; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    private void exercicioD(int i) {
        int soma = 0;
        for (i = 0 ;i <= 500; i++){
            soma = soma + i;
        }
        System.out.println(soma);
    }

    private void exercicioE(int i){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual numero você deseja ver a piramide? ");
        int numero = scanner.nextInt();
        int caracteres = 1;
        for (i = 0; i < numero; i++){
            for (int j = 0; j < caracteres;j++) {
                System.out.print(" # ");
            }
            System.out.println();
            caracteres ++;
        }


    }
    public static void main(String[] args) {
        exercicios modal = new exercicios();

//        System.out.println("exercicio 1");
//        modal.exercicioA(0);
//        System.out.println();
//
//        System.out.println("exercicio 2");
//        modal.exercicioB(50);
//        System.out.println();
//
//        System.out.println("exercicio 3");
//        modal.exercicioC(0);
//        System.out.println();
//
//        System.out.println("exercicio 4");
//        modal.exercicioD(0);
//        System.out.println();

        System.out.println("exercicio 5");
        modal.exercicioE(0);
    }
}
