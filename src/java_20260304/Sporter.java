package java_20260304;

import javax.swing.*;

public abstract class Sporter extends Person {

    public Sporter() {
    }

    public Sporter(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
