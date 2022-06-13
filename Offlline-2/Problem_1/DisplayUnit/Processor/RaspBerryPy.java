package Problem_1.DisplayUnit.Processor;

public class RaspBerryPy extends processor {
    private double Cost;

    public RaspBerryPy(){
        Cost = 3000;
    }

    public double getCost(){
        return Cost;
    }

    public void setCost(double cost){
        Cost = cost;
    }
}
