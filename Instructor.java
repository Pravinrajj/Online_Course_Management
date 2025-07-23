import java.util.*;

public class Instructor extends User {
    private List<Course> coursesTaught = new ArrayList<>();

    public Instructor(String id, String name, String email) {
        super(id, name, email);
    }

    public Course createCourse(String courseId, String title) {
        Course c = new Course(courseId, title, this);
        coursesTaught.add(c);
        return c;
    }

    public void gradeAssignment(Course course, String assignmentId, String studentId, int score) {
        Assignment a = course.getAssignmentById(assignmentId);
        if (a != null) {
            Submission s = a.getSubmissions().get(studentId);
            if (s != null) {
                s.setGrade(score);
            }
        }
    }

    @Override
    public void viewCourses() {
        System.out.println("Instructor " + name + " teaches:");
        for (Course c : coursesTaught) {
            System.out.println("- " + c.getTitle());
        }
    }
}