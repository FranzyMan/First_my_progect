package com.github.franzyman.first_my_project;

public class program4 {
    /*
       Программа по переводу галонов в литры.

        Присвойте файлу с исходным кодом имя program 4.java.
      */
       public static void main (String args []) {
           double gallons; // в этой переменно храниться значение,
                           // выражающее объема жидкости в галлонах
           double liters;  // в этой переменной храниться значение,
                           // выражение объема жидкости в литрах
           gallons = 10;   // Начальное значение соответсвует 10 галлонам

           liters = gallons * 3.7854; // перевод галлонов в литры

       System.out.println (gallons + " Галлонам соответсвует " + liters + " Литра ");

       }
    }

