package ui;

import model.Topic;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Adaptive Study Strategy Engine");

        Topic t1 = new Topic("Math", 40);
        Topic t2 = new Topic("Physics", 80);

        System.out.println(t1.getName() + " Priority: " + t1.calculatePriority());
        System.out.println(t2.getName() + " Priority: " + t2.calculatePriority());
    }
}
