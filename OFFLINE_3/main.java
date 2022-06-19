import java.io.File;
import java.io.IOException;

import AdapterPackage.adapter;
import ServicePackage.service;

public class main {
    public static void main(String[] args) throws IOException {
        //Calculating sum using the service class
        File file1 = new File("InputFiles/space_input.txt");
        service service1 = new service();
        System.out.println("\nSum using service: "+ service1.CalculateSum(file1));

        //Calculating sum using the adapter class
        File file2 = new File("InputFiles/notted_input.txt");
        adapter adapter1 = new adapter();
        System.out.println("\nSum using adapter: "+ adapter1.CalculateSum(file2));
    }
}
