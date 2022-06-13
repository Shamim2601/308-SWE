package Problem_1.Qms;

import java.util.LinkedList;

import Problem_1.DisplayUnit.DisplaySystem.dsystem;
import Problem_1.DisplayUnit.Processor.processor;

public class QMS {
    private processor myprocessor;
    private dsystem mysystem;
    private LinkedList<String> Parts;
    private double totalCost;

    public QMS(){
        Parts = new LinkedList<>();
    }

    public void add(String partname){
        Parts.add(partname);
    }

    public void show(){
        for(int i = 0; i<Parts.size(); i++){
            System.out.println(Parts.get(i));
        }
    }

    public processor getMyprocessor() {
        return myprocessor;
    }

    public void setMyprocessor(processor myprocessor) {
        this.myprocessor = myprocessor;
    }

    public dsystem getMysystem() {
        return mysystem;
    }

    public void setMysystem(dsystem mysystem) {
        this.mysystem = mysystem;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    
    
}
