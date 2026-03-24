package engine;

import model.StudyUnit;

public class StrategyEngine {

    public String analyze(StudyUnit unit) {

        if (unit.getMasteryLevel() < 50) {
            return unit.getName() + " needs more focus";
        } else {
            return unit.getName() + " is well prepared";
        }
    }
}