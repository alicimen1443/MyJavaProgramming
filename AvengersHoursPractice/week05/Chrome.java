package week05;

public class Chrome extends WebDriver{

    public Chrome(String browserType) {
        super(browserType);
    }

    /*
    Method Overriding Rules:
    1-Same name same parameter
    2-Return type must be same or covariant(sub class , sub type)
    3-Access modifier of the overriding method in child
    4-private and final methods cannot be overriden
    5-@Override annotation should be applicable
    6-Static methods cannot be over-riden,they can be hidden.
    7- @Override annotation should be applicable.

     */

    public ID navigateTo(String link){ // covariant of locators are : ID ,Name or TagName class objects
        return new ID(link);
    }



}
