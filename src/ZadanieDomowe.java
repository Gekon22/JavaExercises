

public class ZadanieDomowe {
    public static void main(String[] args) {


        int[] tabelka = new int[] {1,2,3,4,5,6};
        for (int i=0; i< tabelka.length/2; i++) {
            int temp = tabelka[i];
            tabelka[i] = tabelka[tabelka.length - 1 - i];
            tabelka[tabelka.length-1-i] = temp;


        }

        for (int i=0; i< tabelka.length; i++) {
            System.out.println(tabelka[i]);
        }
    }
}