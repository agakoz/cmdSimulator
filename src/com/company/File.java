package com.company;

public class File extends AbstractPattern {
    File(String name, AbstractPattern parent) {
        super(name, parent);
        super.type = "FILE";
    }

    @Override
    protected String getParentPath() {
        if (parent != null) {
            return parent.getParentPath() + "\\" + name;
        }
        else return "C:\\" + name;
    }

    @Override
    public void write() {
        System.out.println(type + ":  " + name);
    }

}