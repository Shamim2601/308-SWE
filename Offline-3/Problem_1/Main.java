package Problem_1;

import java.io.File;
import java.io.FileNotFoundException;

import Problem_1.ServicePackage.Service;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("inp.txt");
        Service service1 = new Service();
        //int sum = service1.CalculateSum(file);
        //System.out.println("\nSum using Service: "+ sum);
        System.out.println(new File("Main.java").getAbsolutePath());
    }
}
