package Problem_1.Qms;

import Problem_1.DisplayUnit.DisplaySystem.LED;
import Problem_1.DisplayUnit.DisplaySystem.dsystem;
import Problem_1.DisplayUnit.Processor.Arduino;
import Problem_1.DisplayUnit.Processor.processor;

public class optimal implements qmsBuilder {
    private QMS qms = new QMS();

    @Override
    public void addProcessor() {
        processor p = new Arduino();
        qms.setMyprocessor(p);
        qms.setTotalCost(qms.getTotalCost()+p.getCost());
        qms.add("Arduino Mega added...(Cost = "+p.getCost()+")");
    }

    @Override
    public void addDispSystem() {
        dsystem ds  = new LED();
        qms.setMysystem(ds);
        qms.setTotalCost(qms.getTotalCost()+ds.getCost());
        qms.add("LED matrix added...(Cost = "+ds.getCost()+")");
        
    }

    @Override
    public QMS getQms() {
        return qms;
    }
    
}
