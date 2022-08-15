public class MultiplicationTable_2Course {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++)
        {
            // multiplication only for odd i
            if (i % 2 == 0)
                // if the condition is met, stop next instructions and back to iteration
                continue;

            for (int j = 1; j<=10; j++)
            {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }

    }
}
