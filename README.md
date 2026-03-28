# LearnTrack - Student & Course Management System

## 📌 Project Overview
LearnTrack is a Core Java-based console application designed to manage students, courses, and enrollments efficiently. This project demonstrates the practical application of Object-Oriented Programming (OOP) principles and clean code practices.

## 🚀 Key Features
- **Student Management**: Register students with unique IDs and batch details.
- **Course Management**: Create and track academic courses.
- **Unique ID Generation**: Automated global ID generation using static members.
- **Data Integrity**: Uses custom exceptions to handle missing entities.

## 🛠️ OOP Concepts Implemented
- **Inheritance**: `Student` class extends the abstract `Person` class.
- **Polymorphism**: Overridden `getInfo()` method to provide specific details for different entities.
- **Encapsulation**: Private fields with public getters/setters to protect data.
- **Abstraction**: Use of an `abstract` base class (`Person`) to define common blueprints.
- **Collection Framework**: Utilized `ArrayList` for dynamic and efficient data storage.

## 📂 Project Structure
- `com.airtribe.learntrack`: Entry point (Main.java).
- `com.airtribe.learntrack.entity`: Data models (Person, Student, Course).
- `com.airtribe.learntrack.service`: Business logic for students and courses.
- `com.airtribe.learntrack.util`: Helper classes like ID Generator.
- `com.airtribe.learntrack.exception`: Custom exception classes.

## 🚦 How to Run
1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run the `Main.java` file.
4. Follow the on-screen console menu to interact with the system.

## 👨‍💻 Author
- **Anchal**
