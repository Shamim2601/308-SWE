package drinksDecorator;

import Burgers.burger;

public class water extends drink {
    private burger Br;
    public water(burger br){
        Br = br;
        System.out.println("water added");
    }

    @Override
    public double getCost() {
        return Br.getCost()+ 30.0;
    }
    
}
