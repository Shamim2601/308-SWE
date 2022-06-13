package Problem_1;

import Problem_1.CommSystem.channel;
import Problem_1.ControlApp.controlApp;
import Problem_1.Qms.qmsBuilder;

public class Director {
    qmsBuilder myBuilder;
    channel mychannel;
    controlApp cApp;
    int NumofUnits;
    private double overallCost;

    public Director(){
        overallCost = 0;
    }


    public void construct(qmsBuilder builder, channel chnl, int numofUnits){
        myBuilder = builder;
        mychannel = chnl;
        NumofUnits = numofUnits;

        cApp = new controlApp();
        cApp.addApp();
        overallCost+= cApp.getCost();

        mychannel.addChannel();
        overallCost+= mychannel.getYearlyCost();

        for(int i = 0; i<numofUnits; i++){
            myBuilder.addProcessor();
            myBuilder.addDispSystem();
        }
        overallCost+= builder.getQms().getTotalCost();
    }

    public double getOverallCost(){
        return overallCost;
    }
    
}
