package ServicePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Service {

    public Service() {
    }

    public double CalculateSum(File fp) throws FileNotFoundException{
        try (Scanner scn = new Scanner(fp)) {
            double sum = 0;
            while(scn.hasNextDouble()){
                sum+= scn.nextDouble();
            }
            return sum;
        }
    }
}
