package com.github.franzyman.first_my_project;

public class SingletonProgram {
    public static void main(String arg []) {
        SingletonExemple e2 = new SingletonExemple();// SingletonExemple.create();
        System.out.println(String.format("Color in main: %f", e2.color));
        Nene n = new Nene();
        n.nene();
    }
}
