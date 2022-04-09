package day35_Encapsulation.encapsulation;

public class ItemTest {
    public static void main(String[] args) {

        Item item = new Item("cheese",10,5);

        System.out.println(item);

        item.setName("toilet paper");
        item.setQuantity(5);
        System.out.println(item);



    }
}
