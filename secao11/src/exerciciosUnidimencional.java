public class exerciciosUnidimencional {
    public static void main(String[] args) {
        String[] nomes = {"Natasha Alianovna Romanoff", "Stephen Vicent Strange", "Anthony4444444444444444 Edward Stark"};

        int maxlenght = -1;
        int index = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].length() > maxlenght) {
                maxlenght = nomes[i].length();
                index = i;
            }
        }

        System.out.println("Maior index é "+ index + 1);
    }
}
