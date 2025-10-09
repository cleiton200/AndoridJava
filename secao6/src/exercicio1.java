import java.util.Scanner;

public class exercicio1 {

    private int conversorMeses(int anos){
        int meses = anos * 12;
        return meses;
    }

    private int conversorDias(int anos){
        int dias = anos * 365;
        return dias;
    }

    private int conversorHoras(int anos){
        int horas = anos * 8766;
        return horas;
    }

    private int conversorMinutos(int anos){
        int minutos = anos * 525960;
        return minutos;
    }

    private int conversorSegundos(int anos){
        int segundos = anos* 31536000;
        return segundos;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor do anos você deseja ver?" );
        int anos = entrada.nextInt();

        //intanciando as funções

        exercicio1 funcao = new exercicio1();

        System.out.println(anos + "ano(s) corresponde a : ");
        System.out.println(funcao.conversorMeses(anos) + " meses" );
        System.out.println(funcao.conversorDias(anos) + " dias");
        System.out.println(funcao.conversorHoras(anos) + " horas");
        System.out.println(funcao.conversorMinutos(anos) + " minutos");
        System.out.println(funcao.conversorSegundos(anos) + " segundos");




    }
}
