import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        map.put("franca", "parisS");
        map.put("franca", "paris");
        map.put("alemanha", "berlim");

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("franca"));

        map.containsKey("alemanha");
        map.clear();


        map.remove("alemanha");
    }
}