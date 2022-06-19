package AdapterPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import ServicePackage.service;

public class adapter {
    public adapter(){

    }

    public int CalculateSum(File file) throws IOException{
        try (Scanner scanner = new Scanner(file)) {
            service serv = new service();
            String str = "";
            File temp = File.createTempFile("tmp", ".txt");
            FileWriter fw = new FileWriter(temp);
            try (BufferedWriter bWriter = new BufferedWriter(fw)) {
                while(scanner.hasNext()){
                    str+= scanner.nextLine();
                }

                String[] strArray = str.split("~");
                for(String s: strArray){
                    bWriter.write(s+" ");
                }
            }

            return serv.CalculateSum(temp);
        }
    }
}
