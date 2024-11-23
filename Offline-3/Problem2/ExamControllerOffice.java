import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExamControllerOffice implements Mediator {
    private List<Script> scripts = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<MarkSheet> marksheets = new ArrayList<>();

    @Override
    public void submitScriptAndMarks(Teacher teacher, List<Script> scripts, MarkSheet markSheet) {
        this.scripts.addAll(scripts);
        marksheets.add(markSheet);
        System.out.println("Teacher " + teacher.getName() + " submitted marks for " + scripts.size() + " scripts.");
    }

    @Override
    public void scrutinizeScripts(Script script, MarkSheet markSheet) {
        System.out.println("Scrutinizing script for course " + script.getCourseID());
        // Add logic to validate marks and correct if necessary
    }

    @Override
    public void publishResults() {
        for (MarkSheet markSheet : marksheets) {
            System.out.println("Publishing results for course: " + markSheet.getCourseID());
            markSheet.getMarksDatabase().forEach((student, marks) -> 
                System.out.println("Student " + student.getName() + ": " + marks + " marks"));
        }
    }

    @Override
    public void requestReExamination(Student student, String courseID) {
        System.out.println("Student " + student.getName() + " requested re-examination for course: " + courseID);
    }

    @Override
    public void reExamine(Teacher teacher, Student student, String courseID) {
        System.out.println("Teacher " + teacher.getName() + " re-examining script for Student " + student.getName());
        // Logic for updating marks after re-examination
    }
}
