public class ex3 {

    private float calcularMedia() {
        float[][] matriz = {{8.8f, 9, 7.6f, 4}, {8.9f, 9.7f, 9.4f, 8.9f}, {10, 10, 9, 9}, {4.7f, 9.9f, 9.2f, 8.9f}};
        float soma = 0;
        int quantidade = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
                quantidade++;
            }
        }

        return soma / quantidade;
    }

    public static void main(String[] args) {

        ex3 multi = new ex3();

        System.out.println(multi.calcularMedia());
    }
}
