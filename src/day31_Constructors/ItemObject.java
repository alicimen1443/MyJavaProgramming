package day31_Constructors;

public class ItemObject {
    public static void main(String[] args) {

        Item tomatoe = new Item("tomatoe",6.5,10);

        Item patatoe = new Item("patatoe",4.5,20);

        Item cheese = new Item("cheese",20,5);

        System.out.println("cheese = " + cheese);
        System.out.println("patatoe = " + patatoe);
        System.out.println("tomatoe = " + tomatoe);
    }
}
