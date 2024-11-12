package com.pizzaApp.viewmodel.design;

public  class Broklyn implements Pizza {
    @Override
    public int getPrice() {
        return 250;
    }

    @Override
    public String getDescription() {
        return "Broklyn pizza";
    }
}
