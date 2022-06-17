package com.github.franzyman.first_my_project;

public class Ui_Api {
        public static void main(String[] args) {

            var ui = TestImpl.builder().setName("Ui").setType("Ui").build();
            var api = TestImpl.builder().setName("Api").setType("Api").build();

            ui.execute();
            api.execute();
        }
    }
