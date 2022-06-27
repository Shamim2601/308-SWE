package drinksDecorator;

import Burgers.burger;

public class coffee extends burger {
    private burger Br;
    public coffee(burger br){
        Br = br;
        System.out.println("coffe added");
    }

    @Override
    public double getCost() {
        return Br.getCost()+ 80.0;
    }
}
