package week05;

public class WebDriver {

    String browserType; // instance variable

    public WebDriver(String browserType){  //one parameter constructor
        this.browserType=browserType;
    }

    // Method overloading examples :
    /*
    1- Happens in the same class
    2-Same name but Different parameters
    3-Return Type does not matter same or NOT
    4-Access modifier can be different
    5-any method can be overloaded in JAVA
     */

    public String findElement(ID id){  // I want to overload with different locator objects
        return id.locator;
    }

    protected String findElement(TagName tagName){
        return tagName.locator;
    }

    public void findElement(Name name){
        System.out.println("Locating the web element with the name locator");
    }

    private final String findElement(ID id, Name name, TagName tagName){
        return "We are using all the locators";
    }

    public static void clickElement(ID id){
        System.out.println("Clicking on "+id.locator);
    }

    public static void clickElement(Name name){
        System.out.println("Clicking on "+name.locator);
    }

    public Locators navigateTo(String link){
        return new Locators(link);
    }


}
