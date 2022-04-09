package week13.inheritence;

public class Ebook extends Book{

    int size;
    int pages;

    public Ebook(String title, String type, String author, double price, int size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("Reading the book from my tablet");
        System.out.println("title = " + title);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
    }
}
