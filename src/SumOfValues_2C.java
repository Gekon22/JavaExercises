public class SumOfValues_2C {
    public static void main(String[] args) {

        int[] numbers = {1, 12, 41, 12, 51, 12};

        int sum = 0;

        for (int number: numbers)
        {
            sum += number;

        }
        System.out.println(sum);
    }
}
