package java;

import business.saleBusiness;
import model.SaleModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.*;

public class SalesTest {

    @Test
    @DisplayName("Valor total vendido por vendedor.")
    void testTotalSalesBySeller() {
        // Dados de exemplo
        List<SaleModel> sales = new ArrayList<>();
        Calendar c = Calendar.getInstance();

        sales.add(new SaleModel(1, c.getTime() ,"Carlos", "iPhone", "Eletrônicos", 500D));
        sales.add(new SaleModel(2, c.getTime() ,"Carlos", "Android", "Eletrônicos", 500D));
        sales.add(new SaleModel(3, c.getTime() ,"Fernanda", "Android", "Eletrônicos", 450D));
        sales.add(new SaleModel(4, c.getTime() ,"Fernanda", "Android", "Eletrônicos", 620D));
        sales.add(new SaleModel(5, c.getTime() ,"Fernanda", "iPhone", "Eletrônicos", 550D));

        // Resultado esperado
        Map<String, Double> expected = new HashMap<>();
        expected.put("Carlos", 1000.0);
        expected.put("Fernanda", 1620D);

        // Chamada ao método
        Map<String, Double> result = saleBusiness.totalSalesPerSeller(sales);

        // Verificação do resultado
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Valor total vendido por categoria.")
    void testRevenueByCategory() {
        // Dados de exemplo
        List<SaleModel> sales = new ArrayList<>();
        Calendar c = Calendar.getInstance();

        sales.add(new SaleModel(1, c.getTime() ,"Carlos", "iPhone", "Eletrônicos", 500D));
        sales.add(new SaleModel(2, c.getTime() ,"Carlos", "HD Externo 1TB", "Armazenamento", 500D));
        sales.add(new SaleModel(3, c.getTime() ,"Fernanda", "SSD M2", "Armazenamento", 450D));
        sales.add(new SaleModel(4, c.getTime() ,"Fernanda", "SSD M2", "Armazenamento", 620D));
        sales.add(new SaleModel(5, c.getTime() ,"Fernanda", "SSD M2", "Armazenamento", 550D));

        // Resultado esperado
        Map<String, Double> expected = new HashMap<>();
        expected.put("Eletrônicos", 500.0);
        expected.put("Armazenamento", 2120.0);

        // Chamada ao método
        Map<String, Double> result = saleBusiness.totalSalesPerCategory(sales);

        // Verificação do resultado
        Assertions.assertEquals(expected, result);
    }
}