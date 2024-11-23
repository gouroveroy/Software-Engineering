public class Script {
    private String id;
    private String courseID;
    private Teacher teacher;
    private Student student;
    private int marks;

    public Script(String id, String courseID, Teacher teacher, Student student, int marks) {
        this.id = id;
        this.courseID = courseID;
        this.teacher = teacher;
        this.student = student;
        this.marks = marks;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getMarks() {
        return marks;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getId() {
        return id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "Script{" +
                "id='" + id + '\'' +
                ", courseID='" + courseID + '\'' +
                ", teacher=" + teacher +
                ", student=" + student +
                ", marks=" + marks +
                '}';
    }
}
