public class References {

    public static void main(String[] args) {

        int a = 5;
        Tes tes = new Tes();
        a = tes.zmienWartosc(a);
        System.out.println(a);

    }
}

class Tes{
    int zmienWartosc(int zm){
        zm = zm + 2;
        return zm;
    }
}
