public class WhileNK {
    public static void main(String[] args) {

        int[] tabela = new int[10];
        int liczba = 10;
        while (liczba < 110) {
            for (int i = 0; i < tabela.length; i++){
                tabela[i] = liczba;
                liczba = liczba + 10;
            }

        }
        int i = 0;
        while (i < tabela.length) {
            System.out.println(tabela[i]);
            i++;
        }

    }
}
