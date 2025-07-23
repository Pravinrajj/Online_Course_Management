import java.util.*;

public class Course {
    private String courseId;
    private String title;
    private Instructor instructor;
    private List<Student> students = new ArrayList<>();
    private List<Assignment> assignments = new ArrayList<>();

    public Course(String courseId, String title, Instructor instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public Assignment getAssignmentById(String id) {
        for (Assignment a : assignments) {
            if (a.getId().equals(id)) return a;
        }
        return null;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public String getTitle() {
        return title;
    }
}