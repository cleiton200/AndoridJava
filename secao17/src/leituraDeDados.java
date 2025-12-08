import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class leituraDeDados {

    public static void readSales() {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        //Este try/catch é colocado para tratar exececao onde CASO A LINHA NÃO POSSUA DADOS
        try {

            //usadao para ler o documento de texto
            //BufferedReader = função pre-existente que le o arquivo
            BufferedReader br = new BufferedReader(new FileReader("secao17/src/dados/data"));

            //responsavel por ler a primeira linha que é o cabeçalho
            br.readLine();

            //atribuia a varivel line o proximo dado a ser lido
            String line = br.readLine();

            //funcao usada para que toda a informação da linha seja lida/extraida do arquivo csv
            do {
                //cria uma array(lista) que irá armazenar os dados lidos
                //a funcao .split é usado para demarcar o separador da minha string, o parametro passado que sera usado como separador
                String[] data = line.split(";");

                //quando separada a string, estamos criando as variaveis onde serão guardadas cada informação
                int id = Integer.parseInt(data[0]);
                Date date = formatter.parse(data[1]);
                String seller = data[2];
                String product = data[3];
                String category = data[4];
                Double price = Double.parseDouble(data[5]);

                new Sale(id, date, seller, product, category, price);

                line = br.readLine();
            } while (line != null);

        } catch (Exception e) {

        }
    }

}
