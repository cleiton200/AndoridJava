import java.util.InputMismatchException;
import java.util.Scanner;

public class arrays {

    private void preenchaTresNUmeros(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];

        for (int i = 0; i < array.length;){
            System.out.println("Informe um numero: ");
           try {
               int numero = scanner.nextInt();
               array[i] = numero;
               i++;
           }catch (InputMismatchException exp){
               System.out.println("Numero invalido");
               scanner.nextLine();
           }
        }
    }

    private void imprimeArray(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2;
        int[] array3 = {1, 2, 3, 4};

        //contruindo o objeto para usar os methodos
        arrays array = new arrays();
        array.imprimeArray(array3);
    }


}