import java.util.Scanner;

public class praticaIfElse {
    /* Gerente 2000
     * Coordenadores 1500
     * Engenheiro 1000
     * Estagiario 500
     * */

    private int calcularBonus(String cargo, int experiencia) {
        int bonus = 0;
        int experinencia = 0;

        if (cargo.equals("estagiario")) {
            bonus = 500;
        } else if (cargo.equals("gerente")) {
            if (experiencia <= 2) {
                bonus = 2000;
            } else {
                bonus = 3000;
            }
        } else if (cargo.equals("coordenador")) {
            if (experiencia <= 1) {
                bonus = 1500;
            } else {
                bonus = 1800;
            }
        } else if (cargo.equals("engenheiro")) {
            bonus = 1000;
        }
        return bonus;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o cargo que está sendo analisado? ");
        String cargo = scanner.nextLine();

        System.out.println("Qual o tempo de experiência da pessoa analisada? ");
        int exepriencia = scanner.nextInt();


        praticaIfElse funcionario = new praticaIfElse();

        System.out.println("O bonus devido a este colaborador é de: " + funcionario.calcularBonus(cargo,exepriencia));
    }
}
