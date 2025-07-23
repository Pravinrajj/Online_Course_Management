# 🎓 Online Course Management System (Java OOP)

This project simulates an **Online Course Management System** designed using **Object-Oriented Programming (OOP)** principles in Java.

## 👨‍🏫 Roles

- `User` (Abstract Class)
  - `Student`
  - `Instructor`

## ✅ Features

- **Course Creation** (Instructor)
- **Student Enrollment**
- **Assignment Upload** (Student)
- **Assignment Grading** (Instructor)
- **View Grades**
- **Role-based ViewCourses (Polymorphism)**

## 🧩 OOP Concepts Used

| Principle      | Applied Through |
|----------------|-----------------|
| Abstraction    | Abstract class `User` with abstract method `viewCourses()` |
| Encapsulation  | Private fields with getters/setters (e.g., `grade`, `submissions`) |
| Inheritance    | `Student` and `Instructor` extend `User` |
| Polymorphism   | Overridden method `viewCourses()` in subclasses |

## 🛠 Class Overview

- `User` – Base abstract class
- `Student` – Enrolls in courses, uploads assignments, views grades
- `Instructor` – Creates courses, adds assignments, grades submissions
- `Course` – Holds students, assignments
- `Assignment` – Has ID, title, and submissions
- `Submission` – Stores content and grade

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/online-course-management.git
   cd online-course-management
