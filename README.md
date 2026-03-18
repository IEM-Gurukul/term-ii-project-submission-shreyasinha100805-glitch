# PCCCS495 – Term II Project

## Project Title

Adaptive Study Strategy Engine

---

## Problem Statement 

Students often struggle to manage multiple subjects and topics while preparing for exams. Traditional study planners require manual prioritization and fail to adapt when performance changes or deadlines approach. This leads to inefficient study patterns where weaker areas are ignored and time is not optimally utilized. The Adaptive Study Strategy Engine addresses this issue by dynamically adjusting study priorities based on mastery level and urgency. Each study topic is modeled as an object containing attributes such as name and performance score. The system analyzes performance data and automatically reorders tasks using a priority-based scheduling mechanism. This project demonstrates structured object-oriented design through abstraction, inheritance, and polymorphism, while ensuring modular and maintainable architecture.

---

## Target User

* College students preparing for semester exams
* School students managing multiple subjects
* Competitive exam aspirants

---

## Core Features

* Add and manage study topics
* Record mastery level for each topic
* Dynamic priority calculation
* Automatic reordering of study schedule
* Priority-based scheduling using collections
* Input validation and exception handling

---

## OOP Concepts Used

* Abstraction: Implemented using an abstract StudyUnit class
* Inheritance: Topic class extends StudyUnit
* Polymorphism: Different priority calculation methods
* Exception Handling: Handles invalid input such as empty topic names
* Collections: PriorityQueue used for dynamic scheduling

---

## Proposed Architecture Description

The system follows a modular object-oriented architecture. The abstract StudyUnit class defines common properties and behavior for all study tasks. The Topic class extends this base class and implements priority calculation logic. A ScheduleManager manages all study tasks using a PriorityQueue to ensure dynamic ordering based on priority. The StrategyEngine evaluates performance data and updates priorities accordingly. The PersistenceManager handles saving and loading of data. The MainApp serves as the user interface and coordinates interactions between all components. This separation ensures scalability, maintainability, and clear responsibility distribution.

---

## How to Run

1. Open terminal in project folder
2. Compile the program:

javac *.java

3. Run the program:

java MainApp

---

## Git Discipline Notes

This project follows strong Git discipline with more than 10 meaningful commits.
Each commit reflects incremental development, including project setup, class implementation, scheduling logic, exception handling, and final testing.
