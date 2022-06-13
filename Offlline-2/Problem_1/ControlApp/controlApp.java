package Problem_1.ControlApp;

public class controlApp {
    private double Cost;

    public controlApp() {
        Cost = 50000;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public void addApp(){
        System.out.println("Control app added... (Cost= "+Cost+")");
    }
    
}
