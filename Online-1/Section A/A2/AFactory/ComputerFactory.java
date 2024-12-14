package AFactory;

import Processor.*;
import Display.*;

public interface ComputerFactory {
    public Processor getProcessor();
    public Display getDisplay();
}
