package com.pizzaApp.viewmodel.design.decorator;

import com.pizzaApp.viewmodel.design.Pizza;

public  class ExtraCheese implements Toping{
    
    
    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with extra Cheese";
    }
}



