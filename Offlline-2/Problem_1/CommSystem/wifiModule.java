package Problem_1.CommSystem;

public class wifiModule extends channel{
    private double YearlyCost;

    public wifiModule() {
        YearlyCost = 25000;
    }

    public double getYearlyCost() {
        return YearlyCost;
    }

    public void setYearlyCost(double yearlyCost) {
        YearlyCost = yearlyCost;
    }

    @Override
    public void addChannel() {
        System.out.println("Wifi module added...(Yearly Cost = "+YearlyCost+")");
        
    }
    
}
