package com.github.franzyman.first_my_project;

public class Shashlik implements Meal {
    private String meat = "баранина";
    private Integer count = 4;

    public void bake() {
        System.out.println("шашлык" + meat + "(" + count + " кусочков) -Готовится ");
    }
}
