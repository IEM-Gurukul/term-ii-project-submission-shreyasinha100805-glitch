# PCCCS495 – Term II Project

## Project Title

Adaptive Study Strategy Engine

## Problem Statement

Students often struggle to manage multiple subjects and topics while preparing for examinations. Traditional study planners require manual prioritization and fail to adapt dynamically when performance changes or deadlines approach. This results in inefficient study patterns where weaker areas are often ignored and time is not optimally utilized.

The Adaptive Study Strategy Engine addresses this problem by dynamically adjusting study priorities based on mastery level and urgency. Each study topic is modeled as an object with attributes such as name and mastery level. The system analyzes performance data and automatically reorders tasks using a priority-based scheduling mechanism.

This project demonstrates structured object-oriented design using abstraction, inheritance, and polymorphism while ensuring modular and maintainable architecture.

## Target Users
College students preparing for semester exams
School students managing multiple subjects
Competitive exam aspirants
⚙️ Core Features
Add and manage study topics
Record mastery level (0–100) for each topic
Dynamic priority calculation based on performance
Automatic reordering of study schedule
Priority-based scheduling using PriorityQueue
Input validation and exception handling
Simple GUI using Java Swing
Swimlane-based system flow visualization (NEW)
Displays interaction between system components
Shows flow: User → MainApp → StrategyEngine → ScheduleManager
Helps understand internal workflow of the system
## OOP Concepts Used
### Abstraction
Implemented using an abstract StudyUnit class to define common behavior.
### Inheritance
Topic class extends StudyUnit to reuse functionality.
### Polymorphism
Method calculatePriority() provides different behavior for study units.
### ncapsulation
Data members are protected and accessed via getter methods.
### Exception Handling
Handles invalid inputs such as empty topic names and incorrect mastery values.
### Collections Framework
Uses PriorityQueue to dynamically manage study scheduling.
### Swimlane Modeling (NEW ADDITION)
The system includes a swimlane-based representation to visualize workflow:
User provides input
MainApp processes data
StrategyEngine analyzes performance
ScheduleManager organizes tasks
Results are displayed to the user
This improves clarity of system interaction and responsibility distribution.

##  Proposed Architecture

The system follows a modular object-oriented architecture:

StudyUnit (Abstract Class)
Defines common attributes (name, masteryLevel) and behavior.
Topic (Subclass)
Extends StudyUnit and implements priority calculation logic.
ScheduleManager
Manages study tasks using a PriorityQueue for dynamic ordering.
StrategyEngine
Analyzes performance data and provides recommendations.
PersistenceManager (Optional Extension)
Handles saving and loading of data.
MainApp (UI Layer)
Provides a Swing-based graphical interface for user interaction.
Swimlane Flow (NEW ADDITION)
Represents system interaction:
User inputs data
MainApp coordinates operations
StrategyEngine performs analysis
ScheduleManager manages priorities
Output is returned to the user

This ensures clear separation of concerns, scalability, and maintainability.

## Swimlane Flow (Conceptual)
USER → MAIN APP → STRATEGY ENGINE → SCHEDULE MANAGER → MAIN APP → USER

## How to Run
Step 1: Open terminal in project folder

Step 2: Compile
javac -d . src/model/*.java src/engine/*.java src/ui/*.java

Step 3: Run
java ui.MainApp

## UML Diagram

The UML diagram represents:

Inheritance
Topic → StudyUnit
Associations
StrategyEngine → StudyUnit
ScheduleManager → StudyUnit
MainApp → StrategyEngine & ScheduleManager

 ## Git Discipline

This project follows strong Git discipline with 10+ meaningful commits.

Each commit reflects incremental development including:

Project setup
Class implementation
Scheduling logic
GUI integration
Exception handling
Final testing

## Future Enhancements
Deadline-based prioritization
Data persistence (file/database)
Android application version
Performance analytics dashboard

## Conclusion

The Adaptive Study Strategy Engine provides a smart and efficient approach to managing study tasks by dynamically prioritizing topics. It demonstrates strong object-oriented design principles along with system workflow visualization through swimlane modeling, making it both practical and scalable.
