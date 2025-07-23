public class Main {
    public static void main(String[] args) {
        Instructor prof = new Instructor("I1", "Dr. Smith", "smith@example.com");
        Course course = prof.createCourse("C101", "OOP in Java");

        Student s1 = new Student("S1", "Alice", "alice@example.com");
        s1.enroll(course);

        Assignment a1 = new Assignment("A1", "Assignment 1");
        course.addAssignment(a1);

        s1.uploadAssignment(course, "A1", "My solution");

        prof.gradeAssignment(course, "A1", "S1", 90);

        s1.viewGrades(course);
        s1.viewCourses();
        prof.viewCourses();
    }
}