package com.github.franzyman.first_my_project;

import java.util.Random;

public class Pizzaria {
    public static void main(String args []) {
        // Создем 4 сыра
        Meal meal = new PizzaForCheese();
        int x = new GenerateRandomInt().GenerateRandomInt(1,3);
        switch(x) {
            case 1:
            meal = new PizzaForCheese();
            break;
            case 2:
            meal = new Shashlik();
            break;
            case 3:
            meal = new Kartoshka();
            break;
        }
        meal.bake();
    }
}

