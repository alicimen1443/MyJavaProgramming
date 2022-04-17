package day35_Encapsulation.encapsulation;

import day35_Encapsulation.encapsulation.Pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObject {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();
        // create 100 pizza object: size - 'S' , cheese topping 2, pepperoni topping - 3
        // create 100 pizza object: size - 'M' , cheese topping 3, pepperoni topping - 4
        // create 100 pizza object: size - 'L' , cheese topping 4, pepperoni topping - 5

        for (int i = 0; i <100 ; i++) {
            Pizza smallPizza = new Pizza("small",2,3);
            Pizza mediumPizza = new Pizza("medium",3,4);
            Pizza largePizza = new Pizza("large",4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }

        System.out.println("Total number of pizzas :"+pizzas.size());

        double totalPrice=0;

        for(Pizza each : pizzas){
            totalPrice+= each.calcCost();
        }

        System.out.println("total price = "+totalPrice);

        Pizza pizza = new Pizza("medium",2,2);

        pizza.setSize("large");
        System.out.println(pizza);





    }
}
