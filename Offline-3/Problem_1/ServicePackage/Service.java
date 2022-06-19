package Problem_1.ServicePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Service {

    public Service() {
    }

    public int CalculateSum(File fp) throws FileNotFoundException{
        try (Scanner scn = new Scanner(fp)) {
            int sum = 0;
            while(scn.hasNextInt()){
                sum+= scn.nextInt();
            }
            return sum;
        }
    }
}
