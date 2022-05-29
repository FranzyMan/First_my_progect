package com.github.franzyman.first_my_project;

public class program5 {
        public static void main(String[] args) {
            int i,j;
            boolean isprime;
            for (i = 1; i<=100; i++){
                isprime=true;
                for(j = 2; j < i ; j++) {
                    if ((i % j) == 0) {
                        isprime = false;
                        break;
                    }
                }
                if(isprime)
                    System.out.println(i+"-простое число");
            }
        }
    }


