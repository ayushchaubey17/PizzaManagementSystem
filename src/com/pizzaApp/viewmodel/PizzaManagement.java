package com.pizzaApp.viewmodel;

import com.pizzaApp.model.Logic;
import com.pizzaApp.view.ViewScreen;
import com.pizzaApp.viewmodel.design.Pizza;

public class PizzaManagement {
    private static ViewScreen viewScreen= new ViewScreen();

    private  static Logic logic = new Logic();
    private static PizzaManagement pizzaManagement = new PizzaManagement();

    private PizzaManagement() {

    }


    public static PizzaManagement getInstance() {
        return pizzaManagement;
    }


    public static void start() {

        while (true)

        {
            int n =   viewScreen.showStartMessage();
            if (n==8) {
                System.out.println("Thanks for using the app");
                System.exit(0);
            }
            else if (n>0 && n<8 ) perform(n);
            else {
                viewScreen.validInput("please enter a valid input");
            }
        }


    }

    private static void perform(int n) {
        Pizza pizza = null;

        if (n==1) pizza = logic.addBismark();
        else if (n==2) pizza = logic.addBroklyn();
        else if (n==3) pizza= logic.addBuffalow();
        else if (n==4) pizza= logic.addCalifornia();
        else if (n==5) pizza = logic.addChicago();
        else if (n==6) pizza= logic.addHawain();
        else if (n==7) pizza= logic.addVegPizza();

      while (true){
          int choice = viewScreen.showTopingMessage();
        if (choice==4)break;
        else {
          pizza =   addingTopings(pizza,choice);
        }

      }

      viewScreen.printTheData(pizza);



    }

    private static Pizza addingTopings(Pizza pizza, int choice) {
        Pizza pizzaAferToping = null;
        if (choice==1) pizzaAferToping = logic.addCheese(pizza);
        if (choice==2) pizzaAferToping =logic.addTomato(pizza);
        if (choice==3) pizzaAferToping =logic.addJalpeno(pizza);
        return pizzaAferToping;
    }


}
