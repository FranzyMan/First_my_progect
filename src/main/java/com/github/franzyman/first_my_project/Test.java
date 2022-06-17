package com.github.franzyman.first_my_project;

public abstract class Test implements Executable {
    String name;
    String type;

    @Override
    public void execute() {
        System.out.println("Test " + name + " (тип " + type + ") - Выполняется");
    }
}
