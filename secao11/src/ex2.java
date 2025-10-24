import java.util.InputMismatchException;

public class ex2 {
    private void mediaValores(float[] valores) {
        try {
            // Verifica se o array é nulo ou vazio
            if (valores == null || valores.length == 0) {
                throw new IllegalArgumentException("O array é nulo ou está vazio.");
            }

            float soma = 0;
            for (int i = 0; i < valores.length; i++) {
                soma += valores[i];
            }

            float media = soma / valores.length;
            System.out.println("A média desses números é: " + media);

        } catch (NullPointerException e) {
            System.out.println("Erro: O array de valores é nulo (null).");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ex2 p = new ex2();

        float[] valores = {14f, 5.3f, 63.5f, 34f, 15f};
        float[] valores2 = {};
        float[] valores3 = null;

        // Testes
        p.mediaValores(valores);
        System.out.println();
        p.mediaValores(valores2);
        System.out.println();
        p.mediaValores(valores3);
    }
}
