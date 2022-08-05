public class InkrementacjaDekrementacja {
    public static void main(String[] ars) {

        int a = 0;
        System.out.println("Wartość a: " + a); //0
        int b = ++a;
        System.out.println("Wartość b: " + b); //1
        System.out.println("Wartość a: " + a); //1
        int c = a++;
        System.out.println("Wartość c: " + c); //1
        System.out.println("Wartość a: " + a); //2

        int d = 0;
        System.out.println("Wartosc d: " + d); //0
        int e = d--;
        System.out.println("Wartosc e: " + e); //0
        System.out.println("Wartosc d: " + d); //-1
        int f = --d;
        System.out.println("Wartosc f: " + f); //-2
        System.out.println("Wartosc d: " + d); //-2

    }
}
