import com.sun.tools.javac.Main;
public class main {
    public static void main(String[] args) {

        System.out.println(Estatico.id);
        new Estatico().abc();
        new Estatico().abc();
        new Estatico().abc();
        new Estatico().abc();
        new Estatico().abc();
        System.out.println(Estatico.id);
    }
}
