import business.ReportBusiness;
import business.saleBusiness;
import model.SaleModel;
import utils.leituraDeDados;

import java.util.List;
import java.util.Map;

public class Main {

    private static final String FILE_PATH = "secao17/src/dados/data";
    public static void main(String[] args) {
        //fazendo o uso do arquivo "data.csv"presente na pasta resoureces
        //Exercicio: Imprime o total de vendas por vendedor
        //Exercicio: Imprime o total de vendas por categoria

        List<SaleModel> saleList = leituraDeDados.readSales(FILE_PATH);

        Map<String, Double >mapSeller = saleBusiness.totalSalesPerSeller(saleList);
        Map<String, Double >mapCategory = saleBusiness.totalSalesPerCategory(saleList);

        System.out.println("Total de vendas por vendedor");
        ReportBusiness.print(mapSeller);
        System.out.println("\nTotal de vendas por categoria");
        ReportBusiness.print(mapCategory);
    }
}