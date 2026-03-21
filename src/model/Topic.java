package model;

public class Topic extends StudyUnit {

    public Topic(String name, double masteryLevel) {
        super(name, masteryLevel);
    }

    @Override
    public int calculatePriority() {
        return (int) (100 - masteryLevel);
    }
}