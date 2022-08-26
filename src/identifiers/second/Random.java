package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // klasa w innej paczce nie ma dostępu do PRIVATE, PROTECTED ani DEFAULT innej klasy

    public void testIdentifier() {
        Parent parent = new Parent();
        System.out.println(parent.first);

        parent.firstMethod();

    }
}
