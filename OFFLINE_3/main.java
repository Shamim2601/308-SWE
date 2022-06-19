import java.io.File;
import java.io.FileNotFoundException;

import ServicePackage.service;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("InputFiles/space_input.txt");
        service service1 = new service();

        System.out.println(service1.CalculateSum(file));
    }
}
