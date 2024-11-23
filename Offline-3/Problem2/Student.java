public class Student {
    private String id;
    private String name;
    private Mediator mediator;

    public Student(String id, String name, Mediator mediator) {
        this.id = id;
        this.name = name;
        this.mediator = mediator;
    }

    public void viewResult(String courseID) {
        mediator.publishResults();
    }

    public void requestReExamination(String courseID) {
        mediator.requestReExamination(this, courseID);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
