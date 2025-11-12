import eletreonico.Computador;
import eletreonico.Eletronico;
import eletreonico.Microfone;

public class Main {

    private void imprimeFuncionamentoLigar(Eletronico e) {
        e.ligar();

    }

    public static void main(String[] args) {

        new Main().imprimeFuncionamentoLigar(( volts, corrente)  -> {
                    System.out.println("Estou ligando classe anonima");
                    System.out.println("Estou ligando classe anonima");
                    System.out.println("Estou ligando classe anonima");
                    System.out.println("Estou ligando classe anonima");
                    System.out.println("Estou ligando classe anonima");
                    System.out.println("Estou ligando classe anonima");
                });

    }
}