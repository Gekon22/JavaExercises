package dziedziczenie.potwory;

public class Zombie extends Potwor{
    public int madnessLevel;
    public String sex;

    public Zombie(){

    }

    public Zombie(double predkoscChodzenia, double zywotnosc){
        super(predkoscChodzenia, zywotnosc);
    }

    public Zombie(double predkoscChodzenia, double zywotnosc, String sex, int madnessLevel){
        super(predkoscChodzenia, zywotnosc);
        this.madnessLevel = madnessLevel;
        this.sex = sex;
    }

    @Override
    public void atakuj() {

    }
}

