public class Teacher {
    private String id;
    private String name;
    private Mediator mediator;

    public Teacher(String id, String name, Mediator mediator) {
        this.id = id;
        this.name = name;
        this.mediator = mediator;
    }

    public void examine(Script script) {
        System.out.println("Teacher " + name + " is examining script for course " + script.getCourseID());
        // Logic to add marks to script
    }

    public void reExamineScript(Script script) {
        System.out.println("Teacher " + name + " is re-examining script for course " + script.getCourseID());
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
