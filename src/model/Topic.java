package model;

public class Topic extends StudyUnit {

    public Topic(String name, int masteryLevel) {
        super(name, masteryLevel);
    }

    @Override
    public int calculatePriority() {
        return 100 - masteryLevel;
    }
}