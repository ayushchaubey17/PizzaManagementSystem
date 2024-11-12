package com.pizzaApp.viewmodel.design;

public  class Chicago implements Pizza {
    @Override
    public int getPrice() {
        return 380;
    }

    @Override
    public String getDescription() {
        return "Chicago pizza";
    }
}


