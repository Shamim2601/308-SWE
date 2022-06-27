package Burgers;

public class chicken_burger extends burger {

    public chicken_burger(){
        System.out.println("Chicken burger added");
    }

    @Override
    public double getCost() {
        return 160;
    }
    
}
