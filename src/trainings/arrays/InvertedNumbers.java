package trainings.arrays;

public class InvertedNumbers {
    public static void main(String[] args) {

        // prints out numbers from 1 to 100 divided by 3
       /* for(int i = 0; i <= 100; i++){
            if(i%3 == 0){
                System.out.println(i);
            }
        } */

        // inverts numbers in array
        int[] array = new int[] {1, 3, 5, 7};

        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];    // 1 3
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            System.out.println("Iteracja nr " + i);


        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        }
    }

