package com.pizzaApp.viewmodel.design.decorator;

import com.pizzaApp.viewmodel.design.Pizza;

public  class FreshTomato implements Toping{

    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+60;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with fresh tomato";
    }
}



