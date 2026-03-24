package model;

public abstract class StudyUnit {

    protected String name;
    protected int masteryLevel;

    public StudyUnit(String name, int masteryLevel) {
        this.name = name;
        this.masteryLevel = masteryLevel;
    }

    public String getName() {
        return name;
    }

    public int getMasteryLevel() {
        return masteryLevel;
    }

    public abstract int calculatePriority();
}