package com.github.franzyman.first_my_project;

public abstract class Pizza implements Meal {
    protected String topping;
    protected String name;

    public void bake() {
        System.out.println("Пицца " + name + "(" + topping + ") -Готовится ");
    }
}
