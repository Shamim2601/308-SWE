package Problem_1.Qms;

import Problem_1.DisplayUnit.DisplaySystem.LCD;
import Problem_1.DisplayUnit.DisplaySystem.dsystem;
import Problem_1.DisplayUnit.Processor.RaspBerryPy;
import Problem_1.DisplayUnit.Processor.processor;

public class deluxe implements qmsBuilder {
    private QMS qms = new QMS();

    public void addProcessor(){
        processor p = new RaspBerryPy();
        qms.setMyprocessor(p);
        qms.setTotalCost(qms.getTotalCost()+p.getCost());
        qms.add("Raspberry Pi added...(Cost = "+p.getCost()+")");
    }

    public void addDispSystem(){
        dsystem ds = new LCD();
        qms.setMysystem(ds);
        qms.setTotalCost(qms.getTotalCost()+ds.getCost());
        qms.add("LCD pannel added...(Cost = "+ds.getCost()+")");
    }

    public QMS getQms(){
        return qms;
    }
    
}
