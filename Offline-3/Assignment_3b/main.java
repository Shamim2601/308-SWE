import java.util.Scanner;

import Burgers.beef_burger;
import Burgers.burger;
import Burgers.veggi_burger;
import appetizerDecorator.french_fry;
import appetizerDecorator.onion_rings;
import cheeseDecorator.cheese;
import drinksDecorator.coffee;
import drinksDecorator.coke;
import drinksDecorator.water;

public class main{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do{
                System.out.println("\nSelect Menu(6 to exit):");
                System.out.println("1. Beef burger with French fry and cheese");
                System.out.println("2. Veggi Burger with onion rings and Bottle of Water");
                System.out.println("3. A combo meal with Veggi burger, French Fry and Coke");
                System.out.println("4. A combo meal with Veggi burger, Onion Rings, Coffee and Water");
                System.out.println("5. A Beef burger only");

                System.out.print("Enter your choice: ");
                choice  = scanner.nextInt();
                if(choice== 6){
                    System.exit(0);
                }

                switch(choice){
                    case 1 :
                        burger meal1 = new beef_burger();
                        meal1 = new french_fry(meal1);
                        meal1 = new cheese(meal1);
                        System.out.println("\nYour order costs: "+ meal1.getCost());
                        break;
                    case 2 :
                        burger meal2 = new veggi_burger();
                        meal2 = new onion_rings(meal2);
                        meal2 = new water(meal2);
                        System.out.println("\nYour order costs: "+ meal2.getCost());
                        break;
                    case 3 :
                        burger meal3 = new veggi_burger();
                        meal3 = new french_fry(meal3);
                        meal3 = new coke(meal3);
                        System.out.println("\nYour order costs: "+ meal3.getCost());
                        break;
                    case 4 :
                        burger meal4 = new veggi_burger();
                        meal4 = new onion_rings(meal4);
                        meal4 = new coffee(meal4);
                        meal4 = new water(meal4);
                        System.out.println("\nYour order costs: "+ meal4.getCost());
                        break;
                    case 5 :
                        burger meal5 = new beef_burger();
                        System.out.println("\nYour order costs: "+ meal5.getCost());
                        break;
                    default:
                        System.out.println("\nPlease choose from 1 to 6");

                }
                
            } while(choice!= 6);
        }
    }
}