public class Submission {
    private String content;
    private Integer grade;

    public Submission(String content) {
        this.content = content;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }
}