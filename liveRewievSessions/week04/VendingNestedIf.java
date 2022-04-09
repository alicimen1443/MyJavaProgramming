package week04;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "tea";
        String snackItem = "candy";

        if (selection == "drink") {
            System.out.println("drink option selected");

        if (drinkItem == "coke") {
            System.out.println("coke is selected");
        } else if (drinkItem == "tea") {
            System.out.println("tea is selected");
        }else{
            System.out.println("coffee is selected");
        }
    }else if(selection=="snack"){
            System.out.println("snack option is selected");
        if(snackItem=="candy"){
            System.out.println("candy is selected");
        }else{
            System.out.println("Chips is selected");
        }

    }else{
            System.out.println("Invalid Entry");
        }

        if(false)
            System.out.println("Hello");
            System.out.println("Running");





    }
}

/*

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
 */
