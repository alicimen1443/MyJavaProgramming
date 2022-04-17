package day38_Inheritance.browserTask;

public class FirefoxBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox browser");
    }
}
