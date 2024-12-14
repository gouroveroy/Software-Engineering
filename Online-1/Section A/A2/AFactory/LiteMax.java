package AFactory;

import Processor.*;
import Display.*;

public class LiteMax implements ComputerFactory {
    @Override
    public Processor getProcessor() {
        return new ARM();
    }

    @Override
    public Display getDisplay() {
        return new OLED();
    }
}
