package model;

public abstract class StudyUnit {

    protected String name;
    protected double masteryLevel;

    public StudyUnit(String name, double masteryLevel) {
        this.name = name;
        this.masteryLevel = masteryLevel;
    }

    public abstract int calculatePriority();

    public String getName() {
        return name;
    }

    public double getMasteryLevel() {
        return masteryLevel;
    }
}