package engine;

import model.StudyUnit;
import java.util.PriorityQueue;

public class ScheduleManager {

    private PriorityQueue<StudyUnit> queue;

    public ScheduleManager() {
        queue = new PriorityQueue<>(
                (a, b) -> b.calculatePriority() - a.calculatePriority());
    }

    public void addTask(StudyUnit unit) {
        queue.add(unit);
    }

    public String getSchedule() {

        if (queue.isEmpty()) {
            return "No tasks added yet";
        }

        StringBuilder result = new StringBuilder();

        PriorityQueue<StudyUnit> temp = new PriorityQueue<>(queue);

        while (!temp.isEmpty()) {
            StudyUnit u = temp.poll();
            result.append(u.getName())
                    .append(" -> Priority: ")
                    .append(u.calculatePriority())
                    .append("\n");
        }

        return result.toString();
    }
}