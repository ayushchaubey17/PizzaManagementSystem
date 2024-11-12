package com.pizzaApp.viewmodel.design;

public  class Veg implements Pizza {
    @Override
    public int getPrice() {
        return 175;
    }

    @Override
    public String getDescription() {
        return "Veg pizza";
    }
}
