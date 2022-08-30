package testelka;

public class PlanetarySystem {
    private String starName;
    private String starType;
    private int numberOfPlanets;

    public PlanetarySystem(){

    }
    public PlanetarySystem(String name, String type, int planets){
        starName = name;
        starType = type;
        numberOfPlanets = planets;
    }

    public PlanetarySystem(String name, String type, String ab){

    }

    public String getStarName() {
        return starName;
    }

    public void setNumberOfPlanets(int number){
        numberOfPlanets = number;
    }

    public int getNumberOfPlanets(){
        return numberOfPlanets;
    }

    public void printNumberOfPlanets(){
        System.out.println("Number of planets: " + numberOfPlanets);
    }
}
