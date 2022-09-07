package trainings;

public class ForEach {

        public void polishBikes() {
            String[] bikes = {"Unibike", "Romet", "Nord"};
            String text = "Here are polish bikes:";
            for(String bike : bikes) {
                text = text + "\n" + bike;
            }
            System.out.println(text);
        }




}

