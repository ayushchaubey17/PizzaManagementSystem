# PizzaApp

## Overview
PizzaApp is a Java-based console application that allows users to order customizable pizzas by selecting different pizza types and adding toppings. The application is designed using the MVVM (Model-View-ViewModel) architecture, with the Factory and Decorator design patterns to handle pizza creation and customization.

## Features
- Choose from a variety of pizza types (Bismark, Brooklyn, Buffalo, California, Chicago, Hawaiian, and Veg).
- Customize your pizza with toppings such as Extra Cheese, Fresh Tomato, and Jalapeno.
- View the description and total cost of the customized pizza.

## Design Patterns Used
1. **MVVM Architecture**: Separates the user interface, business logic, and data representation into distinct layers:
    - **Model**: Contains business logic for creating pizzas and adding toppings (`Logic` class, renamed to `PizzaFactory` in code).
    - **View**: Handles user input and output, interacting with the console (`ViewScreen` class).
    - **ViewModel**: Coordinates data between the Model and View (`PizzaManagement` class).

2. **Factory Pattern**: The `PizzaFactory` class is responsible for creating different types of pizzas based on the user's selection, promoting scalability if new pizza types are added.

3. **Decorator Pattern**: The toppings (Extra Cheese, Fresh Tomato, Jalapeno) are implemented as decorators that can be added to a `Pizza` object. Each decorator class (e.g., `ExtraCheese`, `FreshTomato`, `Jalapeno`) dynamically modifies the pizza's description and price.

## Project Structure
```plaintext
src/
├── com/pizzaApp/model/
│   └── Logic.java     # Responsible for pizza creation and adding toppings
├── com/pizzaApp/view/
│   └── ViewScreen.java       # Handles user interface in the console
├── com/pizzaApp/viewmodel/
│   ├── PizzaManagement.java  # Main controller class implementing MVVM structure
│   └── design/
│       ├── decorator/        # Topping decorators (ExtraCheese, FreshTomato, Jalapeno)
│       └── Pizza.java        # Base Pizza interface
└── Main.java                 # Main class to run the application
```




## Use Cases

1. **Basic Pizza Selection**:
    - *Description*: User selects a pizza type.
    - *Steps*:
        1. User launches the application.
        2. User selects a pizza type from the menu.
        3. The app displays the chosen pizza details (description and price).

2. **Pizza Customization with Toppings**:
    - *Description*: User selects a pizza and adds one or more toppings.
    - *Steps*:
        1. User launches the application and selects a pizza type.
        2. User is prompted to choose toppings (extra cheese, tomato, jalapeno).
        3. The app updates and displays the customized pizza description and price.

3. **Exit the Application**:
    - *Description*: User exits the application.
    - *Steps*:
        1. User selects the exit option from the main menu.
        2. The application thanks the user and closes.
````

                +---------------+
                |   Pizza       |
                |---------------|
                | +getPrice()   |
                | +getDescription() |
                +---------------+
                        ^
                        |
      +------------------|-------------------+
      |                  |                   |
+-----------+     +-----------+     +-----------+
| Bismark   |     | Broklyn   |     | Veg       |
+-----------+     +-----------+     +-----------+
| getPrice()|     | getPrice()|     | getPrice()|
| getDesc() |     | getDesc() |     | getDesc() |
+-----------+     +-----------+     +-----------+

(Main pizza types implement Pizza interface)

                        +-----------------+
                        |      Logic      |
                        +-----------------+
                        | + addBismark()  |
                        | + addBroklyn()  |
                        | + addVegPizza() |
                        +-----------------+
                                |
                                |
                  +-------------|-------------+
                  |                           |
    +------------------+            +------------------+
    | ExtraCheese     |            | FreshTomato      |
    +------------------+            +------------------+
    | +getPrice()      |            | +getPrice()      |
    | +getDescription()|            | +getDescription()|
    +------------------+            +------------------+
````
(Each decorator class implements the Topping interface which extends Pizza)










-------------- Hello Welcome to pizza shop! -------------

Select the pizza (Regular size):---
1. BISMARK pizza -- 220
2. BROOKLYN style pizza --250
3. BUFFALO STYLE pizza  --300
4. CALIFORNIA pizza  --350
5. CHICAGO pizza  --380
6. HAWAIIAN pizza -- 400
7. VEG pizza  --175
8. exit

> 3

Select the Topping variety :---
1. extra cheese  --30
2. extra fresh tomato  --60  
3. extra Jalapeno  --80 
4. Nothing else

> 1
> 4

Your pizza Buffalo pizza with extra Cheese has a cost of 330


```video```



https://github.com/user-attachments/assets/c6f7201c-f7cf-4d99-8e49-aa6474ab6ca5



