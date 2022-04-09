package day22_MultiDimensionalArray;

public class PracticeTask02_Items {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"}, {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"}, {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] each1DArray : items) {
            for (String eachItem : each1DArray) {
                System.out.print(eachItem+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");

        for (String[] each1DArray : items) {
            for (int i = each1DArray.length - 1; i >= 0; i--) {
                System.out.print(each1DArray[i]+"\t");

            }
            System.out.println();
        }
        System.out.println("---------------------------------------");

        for (int i = items.length - 1; i >= 0; i--) { //{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}

            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+" ");

            }

            System.out.println();
            }

        }

    }


/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */
