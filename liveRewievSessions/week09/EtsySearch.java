package week09;

public class EtsySearch {
    public static void main(String[] args) {

        System.out.println("--Starting UI Automation testing for Etsy WebSite--");
        openBrowser("Chrome");
        navigateToUrl("https://www.etsy.com");
        searchForItems("Java");
        if(verifyItemIsDisplayed().equals("PASS")){
            System.out.println("Your test case passed");
        }else{
            System.out.println("Failed Test Case Scenerio");
        }

    }

    public static void openBrowser(String browser){   // chrome,firefox,edge,safari.......
        System.out.println("Launching "+browser+" browser");
    }
    public static void navigateToUrl(String url){

        System.out.println("Navigating to " + url);
    }
    public static void searchForItems(String item){
        System.out.println("PASS: verify "+item+" exist");
        System.out.println("Click on that "+item);
    }
    public static String verifyItemIsDisplayed(){
        String result="PASS";
        return result;
    }
}
