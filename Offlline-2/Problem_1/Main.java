package Problem_1;

import java.util.Scanner;

import Problem_1.CommSystem.channel;
import Problem_1.CommSystem.sim;
import Problem_1.CommSystem.wifiModule;
import Problem_1.Qms.QMS;
import Problem_1.Qms.deluxe;
import Problem_1.Qms.optimal;
import Problem_1.Qms.poor;
import Problem_1.Qms.qmsBuilder;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            Director director = new Director();
            channel ch = null;
            qmsBuilder builder = null;
            System.out.print("\nPlace Your Order(TypeName of QMS__Channel__#Units): ");
            String userInput;
            userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase("exit"))System.exit(0);
            //System.out.println(userInput);
            String str[] = userInput.split(" ");
            if(str[0].equalsIgnoreCase("deluxe")) builder = new deluxe();
            else if(str[0].equalsIgnoreCase("optimal")) builder = new optimal();
            else if(str[0].equalsIgnoreCase("poor")) builder = new poor();
            else{System.out.println("wrong input for unit type name."); continue;}

            if(str[1].equalsIgnoreCase("sim")) ch = new sim();
            else if(str[1].equalsIgnoreCase("wifi")) ch = new wifiModule();
            else{System.out.println("wrong input for channel."); continue;}

            int numofUnits = Integer.parseInt(str[2]);
            if(numofUnits<1){System.out.println("Wrong input for number of units."); continue;}

            director.construct(builder, ch, numofUnits);
            QMS qms = builder.getQms();
            qms.show();

            System.out.println("Total Cost: "+ director.getOverallCost());
        }
    }
}
