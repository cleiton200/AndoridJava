package java;

import model.SaleModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.leituraDeDados;

import java.util.List;

public class leituraDeDadosTest {

    // Caminho do arquivo CSV onde os dados TESTE de vendas estão armazenados
    private static final String FILE_PATH = "./test/resources/test-data.csv";
    private static final String FILE_PATH_WRONG = "./test/resources/test-data-wrong.csv";

    @Test
    @DisplayName("Leitura da quantidade de informações do arquivo .csv.")
    void testReadSales() {
        // Chama o método para ler as vendas a partir do arquivo temporário
        List<SaleModel> sales = leituraDeDados.readSales(FILE_PATH);

        Assertions.assertEquals(2, sales.size());
    }

    @Test
    @DisplayName("Leitura de informações no formato incorreto.")
    void testReadSalesIncorrectForm() {
        // Chama o método para ler as vendas a partir do arquivo temporário
        List<SaleModel> sales = leituraDeDados.readSales(FILE_PATH_WRONG);

        Assertions.assertEquals(0, sales.size());
    }

}