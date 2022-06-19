package drinksDecorator;

import Burgers.burger;

public class coke extends burger {
    private burger Br;
    public coke(burger br){
        Br = br;
    }

    @Override
    public double getCost() {
        return Br.getCost()+ 70.0;
    }
}
