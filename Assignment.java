import java.util.*;

public class Assignment {
    private String id;
    private String title;
    private Map<String, Submission> submissions = new HashMap<>();

    public Assignment(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Map<String, Submission> getSubmissions() {
        return submissions;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}