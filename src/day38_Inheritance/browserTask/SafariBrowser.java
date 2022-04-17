package day38_Inheritance.browserTask;

public class SafariBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening safari browser");
    }

    @Override
    public  void closeBrowser() {
        System.out.println("closing safari browser");
    }
}
