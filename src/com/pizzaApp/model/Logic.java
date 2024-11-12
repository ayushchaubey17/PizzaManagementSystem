package com.pizzaApp.model;

import com.pizzaApp.viewmodel.design.*;
import com.pizzaApp.viewmodel.design.decorator.ExtraCheese;
import com.pizzaApp.viewmodel.design.decorator.FreshTomato;
import com.pizzaApp.viewmodel.design.decorator.Jalpeno;

public class Logic {

    public Pizza addBismark() {
        Pizza pizza = new Bismark();
        return pizza;
    }

    public Pizza addBroklyn() {
        Pizza pizza = new Broklyn();
        return pizza;
    }

    public Pizza addBuffalow() {
        Pizza pizza = new Buffalow();
        return pizza;
    }

    public Pizza addCalifornia() {
        Pizza pizza = new Callifornia();
        return pizza;
    }

    public Pizza addChicago() {
        Pizza pizza = new Chicago();
        return pizza;
    } public Pizza addHawain() {
        Pizza pizza = new Hawain();
        return pizza;
    }
    public Pizza addVegPizza() {
        Pizza pizza = new Veg();
        return pizza;
    }

    public Pizza addCheese(Pizza pizza) {
        Pizza pizzaWithCheese = new ExtraCheese(pizza);
        return pizzaWithCheese;
    }

    public Pizza addJalpeno(Pizza pizza) {
        Pizza pizzaWithJalepeno = new Jalpeno(pizza);
        return pizzaWithJalepeno;
    }

    public Pizza addTomato(Pizza pizza) {
        Pizza pizzaWithTomato = new FreshTomato(pizza);
        return pizzaWithTomato;
    }
}
