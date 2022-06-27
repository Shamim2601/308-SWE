package Burgers;

public class veggi_burger extends burger {
    public veggi_burger(){
        System.out.println("veggy burger added");
    }

    @Override
    public double getCost() {
        return 120;
    }
    
}
