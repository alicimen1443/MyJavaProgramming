package week13.inheritence;

public class BookShop {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title="Intro to Java";
        book1.author="Savitch";
        book1.type="Programming";
        book1.price=85.90;

        System.out.println("book1 = " + book1);

        AudioBook audioBook = new AudioBook("Selenium Cookbook","Automation","Unmes",44.99,60,"Irına");


        audioBook.listen();

        // can I call parent class method with Child class object?
        audioBook.buy();





    }
}
