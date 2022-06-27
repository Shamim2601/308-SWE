package appetizerDecorator;

import Burgers.burger;

public class french_fry extends appetizer {
    private burger burger1;
    public french_fry(burger br){
        burger1 = br;
        System.out.println("french fry added");
    }
    @Override
    public double getCost() {
        return (burger1.getCost()+ 110.0);
    }
    
}
