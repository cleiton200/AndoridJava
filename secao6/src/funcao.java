//função = metodos

public class funcao {

    private void sayHello() {
        System.out.println("Hello word!");
    }

    private void sayHello2(String name) {
        System.out.println("Hello " + name);
    }

    private int sum(int n1, int n2) {
        int total = n1 + n2 ;
        //outros calculos
        return total;
    }

    public static void main(String[] args) {

        funcao abc = new funcao();
        abc.sayHello();
        abc.sayHello2("cleiton");
        abc.sum(2,3);
        System.out.println(abc.sum(2,3));
    }
}
