package ui;

import javax.swing.*;
import java.awt.*;

import model.Topic;
import engine.ScheduleManager;
import engine.StrategyEngine;

public class MainApp extends JFrame {

    private JTextField topicField, masteryField;
    private JTextArea outputArea;

    private ScheduleManager manager = new ScheduleManager();
    private StrategyEngine engine = new StrategyEngine();

    public MainApp() {

        setTitle("Adaptive Study Planner");
        setSize(500, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        topPanel.setBorder(BorderFactory.createTitledBorder("Add Topic"));

        topPanel.add(new JLabel("Topic Name:"));
        topicField = new JTextField();
        topPanel.add(topicField);

        topPanel.add(new JLabel("Mastery Level (0-100):"));
        masteryField = new JTextField();
        topPanel.add(masteryField);

        JButton addBtn = new JButton("Add Topic");
        JButton showBtn = new JButton("Show Schedule");
        JButton clearBtn = new JButton("Clear");

        topPanel.add(addBtn);
        topPanel.add(showBtn);
        topPanel.add(clearBtn);

        add(topPanel, BorderLayout.NORTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        addBtn.addActionListener(e -> addTopic());
        showBtn.addActionListener(e -> showSchedule());
        clearBtn.addActionListener(e -> outputArea.setText(""));
    }

    private void addTopic() {
        try {
            String name = topicField.getText().trim();
            int level = Integer.parseInt(masteryField.getText().trim());

            if (name.isEmpty()) {
                outputArea.setText("❌ Enter topic name");
                return;
            }

            if (level < 0 || level > 100) {
                outputArea.setText("❌ Level must be 0-100");
                return;
            }

            Topic t = new Topic(name, level);
            manager.addTask(t);

            outputArea.setText("✔ " + engine.analyze(t));

        } catch (Exception ex) {
            outputArea.setText("❌ Invalid input");
        }
    }

    private void showSchedule() {
        outputArea.setText("Study Schedule:\n\n" + manager.getSchedule());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainApp().setVisible(true));
    }
}