import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    private static void handleObject(List<Integer> list){
        for (Object o : list){
//            if(o instanceof Integer){
//                System.out.println("Integer");
//            }else if (o instanceof String){
//                System.out.println("String");
//            }else if (o instanceof  Double){
//                System.out.println("Double");
//            }

            System.out.println(o.getClass().getSimpleName());
        }
    }



    public static void main(String[] args) {

        int [] array = new int[10];

        List<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(18);
        list.add(30);


        handleObject(list);

    }
}
