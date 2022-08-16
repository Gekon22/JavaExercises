public class Metody {

    public void calculateTheResult()
    {
        System.out.println("I'll count the result in a moment...");
        int result = 0;
        for (int i = 0; i < 100; i++)
        {
            result = result + i;
        }
        System.out.println("The result is: " + result);

    }

    public int takeTheResult()
    {
        System.out.println("I'll count the result in a moment...");
        int result = 0;
        for (int i = 0; i < 100; i++)
        {
            result = result + i;
        }
        System.out.println("The result is: " + result);
        return result;
    }

    public void calculateTheResultParam(int number)
    {
        System.out.println("Number has value: " + number);
        System.out.println("I'll count the result in a moment...");
        int result = 0;
        for (int i = 0; i < number; i++)
        {
            result = result + i;
        }
        System.out.println("The result is: " + result);

    }

    public int add(int firstNumber, int secondNumber, String word)
    {
       // System.out.println("The sum is " + (firstNumber + secondNumber));
        System.out.println(word);
        return firstNumber + secondNumber;
    }
}
