public class Butelka {
    private double howManyLitres;
    private double capacity = 20;
    Butelka(){

    }

    Butelka(double howManyLitres){
        this.howManyLitres = howManyLitres;
    }


    double getHowManyLitres(){
        return howManyLitres;
    }

    double getCapacity(){
        return capacity;
    }

    void pourIn(double quantity) {

        this.howManyLitres += quantity;
    }



    boolean pourOut(double quantity){
        if(quantity < howManyLitres){
        this.howManyLitres -= quantity;}
        else {
            return false;}
        return true;


    }


    void transfer(double quantity, Butelka where){
        if(this.pourOut(quantity)) {

            where.pourIn(quantity);
        }
                else{
                    System.out.println("Too little");

        }



    }





    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3];

        butelka[0] = new Butelka(5);
        butelka[1] = new Butelka(8);
        butelka[2] = new Butelka(18);


        butelka[1].transfer(3, butelka[2]);

        System.out.println(butelka[0].getHowManyLitres());
        System.out.println(butelka[1].getHowManyLitres());
        System.out.println(butelka[2].getHowManyLitres());




    }
}
