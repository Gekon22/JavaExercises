public class TypyObiektoweRef {

    public static void main(String[] args) {
        // liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt -128 do 127
        Short secondNumber = 32689; // 2 bajty -32768 do 32767
        Integer thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.9934F; // 4 bajty - max ok 4-5 cyfr po przecinku
        Double sixthNumber = 3.9999999999999D; // 8 bajtów - max ok 15 cyfr po przecinku

        // wartości logiczne
        Boolean prawda = true;
        Boolean falsz = false;

        // pojedynczy znak
        Character letter = 'A';

        // ciagi znakow
        String hello = "Hello Gekko";

        System.out.println(hello.charAt(0));
        System.out.println(hello.contains("o"));
        System.out.println(thirdNumber.floatValue());
        System.out.println(hello.getBytes());

    }
}
