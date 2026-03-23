package ui;

import model.Topic;
import engine.ScheduleManager;
import engine.StrategyEngine;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Adaptive Study Strategy Engine");

        Topic t1 = new Topic("Math", 40);
        Topic t2 = new Topic("Physics", 80);
        Topic t3 = new Topic("Chemistry", 60);

        StrategyEngine engine = new StrategyEngine();
        engine.analyze(t1);
        engine.analyze(t2);
        engine.analyze(t3);

        ScheduleManager manager = new ScheduleManager();
        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        System.out.println("\nStudy Schedule (Priority Order):");
        manager.displaySchedule();
    }
}