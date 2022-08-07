public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = 2>1;
        boolean secondValue = 2<1;
        boolean thirdValue = false;
        boolean fourthValue = true;

        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);

        System.out.println(firstValue || secondValue);
        System.out.println(!firstValue);
        System.out.println(!secondValue);
        System.out.println(!thirdValue);
        System.out.println(!(firstValue && secondValue));

    }
}
