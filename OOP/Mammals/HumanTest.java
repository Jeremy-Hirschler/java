

public class HumanTest {
    public static void main(String[] args){
        Human allan = new Human();
        allan.regulateTemperature();
        allan.startSleeping();
        allan.goToWork();
        boolean sleeping = allan.isSleeping();

        if (sleeping){
            System.out.println("The human is sleeping");
        }
        // System.out.println("Doesitwork");
    }
}
