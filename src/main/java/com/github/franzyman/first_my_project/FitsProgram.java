package com.github.franzyman.first_my_project;

public class FitsProgram {

    public static final int FEET_COEF = 3;

    public static void main(String... args) {
        // запускаем цикл от 100 метров до 3000 через 500
        for (int meters = 0; meters <= 3000; meters += 500) {
            int m = meters;
            if (meters == 0) {
                m = 100;
            }
            // перевоим высоту из метров в футы
            // выводим полученное значение
            System.out.println(m + " метров = " + (m * FEET_COEF) + " футов.");
        }
    }

}
