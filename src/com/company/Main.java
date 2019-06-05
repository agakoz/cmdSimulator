package com.company;

public class Main {

    public static void main(String[] args) {
        Folder mainFolder = new Folder("mainFolder", null);

        Folder folder1 = new Folder("folder1", mainFolder);
        Folder folder2 = new Folder("folder2", mainFolder);

        mainFolder.addElement(folder1);
        mainFolder.addElement(folder2);

        Folder folder11 = new Folder("folder11", folder1);
        folder1.addElement(folder11);

        Folder folder111 = new Folder("folder111", folder11);
        folder11.addElement(folder111);

        Folder folder21 = new Folder("folder21", folder2);
        Folder folder22 = new Folder("folder22", folder2);

        folder2.addElement(new File("file", folder2));

        folder2.addElement(folder21);
        folder2.addElement(folder22);

        ConsoleMenu menu = new ConsoleMenu();

        menu.start(mainFolder);
    }
}
