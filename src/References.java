public class References {

    public static void main(String[] args) {

        int a = 5;
        Foo2 foo = new Foo2();

        Test x = new Test();

        x.zmienWartosc(a);
        System.out.println(a);



        // x.zmienZawartosc(foo);


    }
}

class Test{
    void zmienWartosc(int zm){
        zm = zm + 2;
    }
    // void zmienZawartosc(Foo2 zm){        zm.a = zm.a + 2;
    }


class Foo{
    int a = 5;
}

