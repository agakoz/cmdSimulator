package com.company;

public abstract class AbstractPattern {
    String name;
    String type;
    AbstractPattern parent;

    AbstractPattern(String name, AbstractPattern parent) {
        this.name = name;
        this.parent = parent;
    }

    public abstract void write();

    protected abstract String getParentPath();
}
