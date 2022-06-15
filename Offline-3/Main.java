import java.io.File;
import java.io.FileNotFoundException;

import ServicePackage.Service;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("input.txt");
        Service service1 = new Service();
        double sum = service1.CalculateSum(file);
        System.out.println("\n"+sum);
    }
}
