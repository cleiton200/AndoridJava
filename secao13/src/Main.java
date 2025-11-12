import eletreonico.Computador;
import eletreonico.Eletronico;
import eletreonico.Microfone;

public class Main {

    private void imprimeFuncionamentoLigar(Eletronico e){
        e.ligar();

    }

    public static void main(String[] args) {

        new Main().imprimeFuncionamentoLigar(new Eletronico() {
            @Override
            public void ligar() {
                System.out.println("estou ligando classe anonima ");
            }

            @Override
            public void desligar() {
                System.out.println("estou desligando classe anonima");
            }
        });

    }
}