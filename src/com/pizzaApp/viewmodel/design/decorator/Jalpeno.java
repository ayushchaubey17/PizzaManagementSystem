package com.pizzaApp.viewmodel.design.decorator;

import com.pizzaApp.viewmodel.design.Pizza;

public  class Jalpeno implements Toping{

    Pizza pizza;

    public Jalpeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with jalpeno";
    }
}