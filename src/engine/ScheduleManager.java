package engine;

import model.StudyUnit;
import java.util.PriorityQueue;

public class ScheduleManager {

    private PriorityQueue<StudyUnit> queue;

    public ScheduleManager() {
        queue = new PriorityQueue<>(
            (a, b) -> b.calculatePriority() - a.calculatePriority()
        );
    }

    public void addTask(StudyUnit unit) {
        queue.add(unit);
    }

    public void displaySchedule() {
        while (!queue.isEmpty()) {
            StudyUnit u = queue.poll();
            System.out.println(u.getName() + " -> Priority: " + u.calculatePriority());
        }
    }
}