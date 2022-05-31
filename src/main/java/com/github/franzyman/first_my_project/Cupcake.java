package com.github.franzyman.first_my_project;

public abstract class Cupcake implements Meal{
    protected String topping;
    protected String nachinka;
    protected String name;
    public Cupcake() {
        this.nachinka = "3 изюма";
    }

    public void bake() {
        System.out.println("Cupcake" + name + "(" + topping +", " + nachinka + ") -В процессе "); }

}
