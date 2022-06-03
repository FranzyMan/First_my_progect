package com.github.franzyman.first_my_project;

public class Nene {
    public void nene() {
        SingletonExemple e = SingletonExemple.create();
        System.out.println(String.format("Color: %f",e.color));
    }
}
