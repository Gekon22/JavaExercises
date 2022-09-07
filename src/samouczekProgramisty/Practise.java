package samouczekProgramisty;

public class Practise {



        void printSomethingIfNumberIsBig ( int number){
            if (number < 10) {
                return;
            }
            System.out.println(number);
        }

        boolean isBig (int number){
            System.out.println("isBig");
            return number > 100;
        }

        // boolean a = isBig(101);
        boolean b = isBig(99);


        void print(String sth) {
            System.out.println(sth);
        }

        boolean howTemp(int temp) {
            return temp > 0;
            }

        }



    
