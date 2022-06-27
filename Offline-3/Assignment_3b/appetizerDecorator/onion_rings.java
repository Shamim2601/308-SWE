package appetizerDecorator;

import Burgers.burger;

public class onion_rings extends burger {
    private burger Br;
    

    public onion_rings(burger br) {
        Br = br;
        System.out.println("onion rings added");
    }


    @Override
    public double getCost() {
        return (Br.getCost()+ 90.0);
    }
    
}
