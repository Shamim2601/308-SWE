package Problem_1.DisplayUnit.DisplaySystem;

public class LED extends dsystem {
    private double Cost;
    
    public LED(){
        Cost = 3000;
    }

    public double getCost(){
        return Cost;
    }

    public void setCost(double cost){
        Cost = cost;
    }
}
