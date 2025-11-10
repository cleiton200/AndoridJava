package eletreonico;

public class Computador extends Eletronico {

    //carregar os drives
    //carregar o SO

    @Override
    public void ligar(){
        super.ligar();
        System.out.println("Carregar drivers");
        System.out.println("Carregar SO");
    }

   public void instalarSoftware(){
       super.ligar();
       super.desligar();
   }
}
