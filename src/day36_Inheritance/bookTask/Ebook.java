package day36_Inheritance.bookTask;

public class Ebook extends Book {

    public String size;
    public int pages;

    public void setInfo(String size, int pages) {
        this.size = size;
        this.pages = pages;
    }


    public void readBook(){

        System.out.println("Reading :"+title);
    }
    public String toString() {
        return "Ebook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }



}
/*
3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */