package com.company;

import java.util.ArrayList;

public class Folder extends AbstractPattern {

    private ArrayList<AbstractPattern> elements = new ArrayList<>();

    Folder(String name, Folder parent) {
        super(name, parent);
        super.type = "DIR";
    }

    void addElement(AbstractPattern j) {
        elements.add(j);
    }


    public AbstractPattern checkChildren(String input) {
        for (AbstractPattern e : elements) {
            if (e.type.equals("DIR") && e.name.equals(input)) return e;
        }
        return null;
    }

    @Override
    protected String getParentPath() {

        if (parent != null) {
            return parent.getParentPath() + "\\" + name;
        } else return "C:\\" + name;
    }

    @Override
    public void write() {
        elements.forEach(p -> System.out.println(p.type + "\t" + p.name));
    }
}