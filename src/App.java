import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("________________Welcome to Pizzamania_____________");
        System.out.println("Which pizza: (1.Veg Pizza   2.Non-Veg Pizza  3.Delux Veg Pizza  4.Delux Non-Veg Pizza)");
        try (Scanner sc = new Scanner(System.in)) {
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    pizza vegPizza = new pizza(true);
                    vegPizza.addExtraToppings();
                    vegPizza.addExtraCheese();
                    vegPizza.takeAway();
                    vegPizza.getBill();
                    break;

                case 2:
                    pizza nonvegPizza = new pizza(false);
                    nonvegPizza.addExtraToppings();
                    nonvegPizza.addExtraCheese();
                    nonvegPizza.takeAway();
                    nonvegPizza.getBill();
                    break;
                    
                case 3:
                    DeluxPizza vegDelux = new DeluxPizza(true);
                    vegDelux.takeAway();
                    vegDelux.getBill();
                    break;

                case 4:
                    DeluxPizza nonvegDelux = new DeluxPizza(false);
                    nonvegDelux.takeAway();
                    nonvegDelux.getBill();
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        }
    }

