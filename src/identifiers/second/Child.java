package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    // klasa potomna w INNEJ PACZCE nie ma dostepu do PRIVATE oraz DEFAULT (default to inaczej packegowy)

    public void testIdentifiers() {
        System.out.println(first);
       // System.out.println(second);
        System.out.println(third);
      //  System.out.println(fourth);
        firstMethod();
      //  secondMethod();
        thirdMethod();
      //  fourthMethod();
    }
}