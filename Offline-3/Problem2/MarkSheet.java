import java.util.HashMap;
import java.util.Map;

public class MarkSheet {
    private String id;
    private String courseID;
    private Map<Student, Integer> marksDatabase = new HashMap<>();

    public MarkSheet(String id, String courseID) {
        this.id = id;
        this.courseID = courseID;
    }

    public void addMarks(Student student, int marks) {
        marksDatabase.put(student, marks);
    }

    public Map<Student, Integer> getMarksDatabase() {
        return marksDatabase;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getId() {
        return id;
    }
}
