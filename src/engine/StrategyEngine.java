package engine;

import model.StudyUnit;

public class StrategyEngine {

    public void analyze(StudyUnit unit) {
        if (unit.getMasteryLevel() < 50) {
            System.out.println(unit.getName() + " needs more focus.");
        } else {
            System.out.println(unit.getName() + " is well prepared.");
        }
    }
}
