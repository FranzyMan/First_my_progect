package com.github.franzyman.first_my_project;

public class SingletonExemple {
    private static SingletonExemple object;
    public Double color;


    public static SingletonExemple create() {
        SingletonExemple currentObject = object;
        if(currentObject == null) {
            currentObject = new SingletonExemple();
            currentObject.color = Math.random();
            object = currentObject;
        }
        return currentObject;
    }
}
