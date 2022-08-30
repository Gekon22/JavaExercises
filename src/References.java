public class References {

    public static void main(String[] args) {

        int a = 5;
        Foo foo = new Foo();

        Test x = new Test();

        x.zmienWartosc(a);
        System.out.println(a);



        x.zmienZawartosc(foo);
        System.out.println(foo.a);

    }
}

class Test{
    void zmienWartosc(int zm){
        zm = zm + 2;
    }
    void zmienZawartosc(Foo zm){
        zm.a = zm.a + 2;
    }
}

class Foo{
    int a = 5;
}

