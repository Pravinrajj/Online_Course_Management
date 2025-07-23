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

## 📚 Project Explanation

This **Online Course Management System** is a mini OOP-based Java application that simulates core functionalities of an educational platform like Coursera or Udemy, focusing on core **Object-Oriented Programming principles**.

### 🎯 Purpose

The project demonstrates how to model a **real-world system** (an e-learning platform) using **Java classes and objects**, incorporating **Abstraction, Encapsulation, Inheritance, and Polymorphism**. It's a great way to learn **clean code design**, **role-based logic**, and **object relationships**.

---

### 🧠 System Overview

1. **User Role Abstraction**:
   - The abstract class `User` defines the common properties and behavior of all users.
   - `Student` and `Instructor` extend it to implement role-specific actions.

2. **Course Management**:
   - Instructors can create courses and add assignments.
   - Students can enroll in these courses and submit their work.

3. **Assignment Handling**:
   - Each assignment keeps track of student submissions.
   - Instructors can grade these submissions, and students can view their grades.

4. **Method Overriding**:
   - Both `Student` and `Instructor` override `viewCourses()` to display context-specific results.

---

### 💡 Learning Outcomes

- Understand how to **design class hierarchies** with inheritance.
- Apply **encapsulation** using private fields and public getters/setters.
- Experience **real-world modeling** using object associations (1-to-many, many-to-1).
- Practice clean OOP logic for future **interview prep** or **mini-project submissions**.
  
## 🛠 Class Overview

- `User` – Base abstract class
- `Student` – Enrolls in courses, uploads assignments, views grades
- `Instructor` – Creates courses, adds assignments, grades submissions
- `Course` – Holds students, assignments
- `Assignment` – Has ID, title, and submissions
- `Submission` – Stores content and grade
