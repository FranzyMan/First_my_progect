package com.github.franzyman.first_my_project;

public class GenerateRandomInt {
    public int GenerateRandomInt(int i, int i1) {
        int x = (int) Math.ceil(Math.random()*10/(i1-i));
        if(x>3) x = 3;
        return x;
    }
}
