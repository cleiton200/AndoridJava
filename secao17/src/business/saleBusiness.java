package business;

import model.SaleModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class saleBusiness {
    //aqui está sendo criado um metodo que é do tipo MAP, que espera uma chave e um valor, nsse casso é seller e price
    //a função recebe como parametro a "list" que é atraves da classe leitura de dadoos

    public static Map<String, Double> totalSalesPerSeller(List<SaleModel> list) {
        //abaixo estou criando um OBJETO que será usada somente nesse metodo(funcao
        //a conotação HashMap é como os dados serão colocados(chave, valor)
        Map<String, Double> totalBySeller = new HashMap<>();

        //laço usado para percorer todos os dados da minha lista
        //primeira parte do for manda qual o tipo de dado (no caso SaleModel da classe que criei) e coloca na V sale
        //segunda parte diz que toda a minha list passada como parametro no metodo seja percorrida
        for (SaleModel sale : list) {
            // pega o vendedor e o valor e tras para o meu metodo para podermos ultiliza-lo
            String seller = sale.getSeller();
            Double price = sale.getPrice();


            if (totalBySeller.containsKey(seller)) {
                totalBySeller.put(seller, price + totalBySeller.get(seller));
            } else {
                totalBySeller.put(seller, price);
            }
        }


        return totalBySeller;
    }

    public  static Map<String, Double> totalSalesPerCategory(List<SaleModel> list) {

        Map<String, Double> totalBySeller = new HashMap<>();


        for (SaleModel sale : list) {
            String category = sale.getCategory();
            Double price = sale.getPrice();


            if (totalBySeller.containsKey(category)) {
                totalBySeller.put(category, price + totalBySeller.get(category));
            } else {
                totalBySeller.put(category, price);
            }
        }
        return totalBySeller;
    }
}