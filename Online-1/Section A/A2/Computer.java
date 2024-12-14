import Display.*;
import Processor.*;

class Computer {
    private final String modelName;
    private final Processor processor;
    private final Display display;

    public Computer(String modelName, Processor processor, Display display) {
        this.modelName = modelName;
        this.processor = processor;
        this.display = display;
    }

    public void printDescription() {
        System.out.println("Model: " + modelName);
        System.out.println("Processor: " + processor.show());
        System.out.println("Display: " + display.show());
    }
}