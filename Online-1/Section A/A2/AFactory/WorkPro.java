package AFactory;

import Processor.*;
import Display.*;

public class WorkPro implements ComputerFactory {
    public Processor getProcessor() {
        return new Intel();
    }

    public Display getDisplay() {
        return new IPS();
    }
}
