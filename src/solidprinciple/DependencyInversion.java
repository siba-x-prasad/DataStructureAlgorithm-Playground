package solidprinciple;

/**
 * Dependency Inversion Principle
 * The principle states that we must use abstraction (abstract classes and interfaces) instead of concrete implementations.
 */

public class DependencyInversion {
}

/**
 * In the below example we create the instance of Keyboard and Monitor. \
 * Both the classes are tightly coupled with WindowsMachine class
 * But to make it according to  dependency inversion principle, we will pass the instance of the 2 classes
 * using constructor
 */

class WindowsMachine {
//    public final keyboard;
//    public final monitor;

    public WindowsMachine() {
//        monitor = new monitor();  //instance of monitor class
//        keyboard = new keyboard(); //instance of keyboard class
    }
}

interface Keyboard {
    //functionality
}

class WindowsMachineWithDependencyInversion {
    //    private final Keyboard keyboard;
//    private final Monitor monitor;
    public WindowsMachineWithDependencyInversion(/*Keyboard keyboard, Monitor monitor*/) {
//        this.keyboard = keyboard;
//        this.monitor = monitor;
    }
}