package ServicePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class service {
    public service(){

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
