package Problem_1.DisplayUnit.Processor;

public class AtMega32 extends processor {
    private double Cost;

    public AtMega32(){
        Cost = 1000;
    }

    public double getCost(){
        return Cost;
    }

    public void setCost(double cost){
        Cost = cost;
    }
}
