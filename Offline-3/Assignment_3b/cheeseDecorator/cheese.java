package cheeseDecorator;

import Burgers.burger;

public class cheese extends burger {
    private burger Br;
    public cheese(burger br){
        Br = br;
    }

    @Override
    public double getCost() {
        return Br.getCost()+ 120.0;
    }
}
