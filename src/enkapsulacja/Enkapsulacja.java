package enkapsulacja;

import java.util.Scanner;

public class Enkapsulacja {
    public static void main(String[] args) {

        KontoBankowe oszszednosciowe = new KontoBankowe();

        // scanner for taking info about wplac or wyplac
        Scanner scannerInfo = new Scanner(System.in);
        // scanner for taking info how much money
        Scanner scannerAmount = new Scanner(System.in);
        System.out.println("Balance is: " + oszszednosciowe.getSaldo());
        System.out.println("Enter 1 for withdraw or 2 for deposit.");
        int info = scannerInfo.nextInt();
        System.out.println("How much?");
        int amount = scannerAmount.nextInt();
        if (info == 1)
        {
            oszszednosciowe.wyplac(amount);
        }
        else if (info ==2){
            oszszednosciowe.wplac(amount);
        }
        else{
            System.out.println("Wrong command, enter 1 or 2");
        }
        // show current balance
        System.out.println("Balance is: " + oszszednosciowe.getSaldo());


    }
}
class KontoBankowe
{
    public KontoBankowe()
    {
        saldo = 1000;
    }
    private int saldo;

    int getSaldo()
    {
        return saldo;
    }
    boolean setSaldo(int saldo)
    {
        this.saldo = saldo;
        return true;
    }
    boolean wyplac(int ile)
    {
        if (saldo < ile)
            return false;
        else
        {
            setSaldo(saldo - ile);
        }
        return true;
    }
    boolean wplac(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }

}
