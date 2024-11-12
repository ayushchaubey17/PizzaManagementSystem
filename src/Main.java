import com.pizzaApp.viewmodel.PizzaManagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- Hello Welcome to pizzaa shop! ------------- \n");
        PizzaManagement pizzaManagement = PizzaManagement.getInstance();
        pizzaManagement.start();
    }
}