import java.util.*;

public class Student extends User {
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String id, String name, String email) {
        super(id, name, email);
    }

    public void enroll(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void uploadAssignment(Course course, String assignmentId, String content) {
        Assignment a = course.getAssignmentById(assignmentId);
        if (a != null) {
            a.getSubmissions().put(this.id, new Submission(content));
        }
    }

    public void viewGrades(Course course) {
        for (Assignment a : course.getAssignments()) {
            Submission s = a.getSubmissions().get(this.id);
            if (s != null && s.getGrade() != null) {
                System.out.println("Assignment: " + a.getTitle() + ", Grade: " + s.getGrade());
            }
        }
    }

    @Override
    public void viewCourses() {
        System.out.println("Student " + name + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getTitle());
        }
    }
}