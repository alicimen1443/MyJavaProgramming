package day31_Constructors.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Ali Cimen","Midyat",5);

        Server server1 = new Server("Ali",123,20,true);
        Server server2 = new Server("Veli",154,25,false);
        Server server3 = new Server("Ahmet",114,15,true);
        Server server4 = new Server("Mehmet",178,10,false);
        Server server5 = new Server("Aygun",185,300,true);

        Server [] serversList={server2,server5,server3,server4};

        Chef chef1 = new Chef("Layan",528,10.5,false);
        Chef chef2 = new Chef("Hulya",432,15.5,true);
        Chef chef3 = new Chef("Alessandra",212,20.7,false);
        Chef chef4 = new Chef("Jack",203,20,true);
        Chef chef5 = new Chef("John",985,20,false);

        Chef[] chefsList = {chef2,chef3,chef4,chef5};

        restaurant1.hireServer(server1);
        restaurant1.hireServer(serversList);

        restaurant1.hireChef(chef1);
        restaurant1.hireChef(chefsList);


        restaurant1.terminateChef(203);
        restaurant1.terminateServer(185);

        System.out.println(restaurant1);

        System.out.println("---------------------------------------");

        for (Server server : restaurant1.servers) {
            System.out.println(server.name+" : "+server.employeeID);
        }

        System.out.println("--------------------------------------");

        for(Chef eachChef : restaurant1.chefs){
            System.out.println(eachChef.name+" : "+eachChef.employeeID);
        }

        chef4.makeOrder();
        chef1.washDishes();
        server4.takeOrder();










    }
}
