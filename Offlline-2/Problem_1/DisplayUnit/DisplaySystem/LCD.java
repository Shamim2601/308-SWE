package Problem_1.DisplayUnit.DisplaySystem;

public class LCD extends dsystem {
    private double Cost;

    public LCD(){
        Cost = 5000;
    }

    public double getCost(){
        return Cost;
    }

    public void setCost(double cost){
        Cost = cost;
    }
}
