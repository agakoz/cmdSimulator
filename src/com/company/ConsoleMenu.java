package com.company;

import java.util.Scanner;

public class ConsoleMenu {

    public void start(Folder f) {
        Scanner read = new Scanner(System.in);
        String input;
        Folder folder = f;

        do {
            System.out.print(folder.getParentPath() + '>');
            input = read.nextLine();

            if (input.toLowerCase().equals("dir")) {
                folder.write();

            } else if (input.toLowerCase().equals("cd")) {
                System.out.println(folder.getParentPath());

            } else if (input.toLowerCase().equals("cd..")) {

                if (folder.parent != null) {
                    folder = (Folder) folder.parent;
                }

            } else if (input.matches("(cd [a-zA-Z0-9]+.)")) {
                input = input.substring(3, input.length());
                Folder newF = (Folder) folder.checkChildren(input);
                if (newF != null) folder = newF;
                else System.out.println("Unknown path!");

            } else if (!input.equals("exit")) {
                System.out.println("Unknown command!");
            }


        } while (!(input.equals("exit")));
    }
}