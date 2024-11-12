package com.pizzaApp.view;

import com.pizzaApp.viewmodel.design.Pizza;

import java.util.Scanner;

public class ViewScreen {
    private Scanner scanner = new Scanner(System.in);

    public int showStartMessage() {
        String str = """
                Select the pizza (Regular size) :---
                1. BISMARK pizza -- 220
                2. BROKLYN style pizza --250
                3. BUFFALO STYLE pizza  --300
                4. CALIFORNIA pizza  --350
                5. CHICAGO pizza  --380
                6. HAWAIIAN pizza -- 400
                7. VEG pizzza  --175
                8. exit
                """;

        System.out.println(str);

        int n = scanner.nextInt();
        return n;


    }

    public void validInput(String prompt) {
        System.out.println(prompt);
    }

    public int showTopingMessage() {
        String str = """
                Select the Toping variety :--- 
                1. extra cheese  --30 
                2. extra fresh tommato  --60  
                3. extra Jalpeno  --80 
                4. Nothing else
                """;


        System.out.println(str);



        int n = scanner.nextInt();
        return n;
    }

    public void printTheData(Pizza pizza) {
        System.out.println("Your pizza "+pizza.getDescription()+" having cost "+pizza.getPrice());
    }
}
