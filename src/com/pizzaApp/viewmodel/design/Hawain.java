package com.pizzaApp.viewmodel.design;

public  class Hawain implements Pizza {
    @Override
    public int getPrice() {
        return 400;
    }

    @Override
    public String getDescription() {
        return "Hawain pizza";
    }
}

