import java.util.List;

public interface Mediator {
    void submitScriptAndMarks(Teacher teacher, List<Script> scripts, MarkSheet markSheet);

    void scrutinizeScripts(Script script, MarkSheet markSheet);

    void publishResults();

    void requestReExamination(Student student, String courseID);

    void reExamine(Teacher teacher, Student student, String courseID);
}
