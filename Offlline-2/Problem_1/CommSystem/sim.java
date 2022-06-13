package Problem_1.CommSystem;

public class sim extends channel {
    private double YearlyCost;

    public sim(){
        YearlyCost = 30000;
    }

    public double getYearlyCost() {
        return YearlyCost;
    }

    public void setYearlyCost(double yearlyCost) {
        YearlyCost = yearlyCost;
    }

    @Override
    public void addChannel() {
        System.out.println("Sim for mobile data added... ( Yearly Cost = "+YearlyCost+")");
        
    }
    
}
