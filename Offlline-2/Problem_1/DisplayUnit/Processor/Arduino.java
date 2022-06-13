package Problem_1.DisplayUnit.Processor;

public class Arduino extends processor{
    private double Cost;

    public Arduino(){
        Cost = 2000;
    }

    public double getCost(){
        return Cost;
    }

    public void setCost(double cost){
        Cost = cost;
    }
}
