import java.util.Date;

public class ProgramowanieObiektowe {
    public static void main(String[] args) {

        // Punkt p = new Punkt(10, 15);
        // Punkt p2 = new Punkt(10, 15);

        Punkt[] punkty = new Punkt[3];
        punkty[0] = new Punkt(1,2);
        punkty[1] = new Punkt(3,5);
        punkty[2] = new Punkt(10,20);

        for (int i = 0; i < punkty.length; i++)
            System.out.println(punkty[i]);

       // if (p.equals(p2)) {
       //     System.out.println("Są równe");
       // }

        final Date data;

    }
}
class Punkt
{
    Punkt()
    {
        System.out.println("Wywołano konstruktor domyślny");

    }
    Punkt(int x, int y)
    {
        System.out.println("Wywołano konstruktor z dwoma parametrami");
        this.x = x;
        this.y = y;

    }
    int x;
    int y;


    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public boolean equals (Object o) {
        Punkt przyslany = (Punkt)o;
        return przyslany.x == x && przyslany.y == y;
    }

    public String toString() {
        return "aaa";
    }
}
