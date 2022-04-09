package java_Shorts;

import java.util.Scanner;

public class InterviewQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] purchase = new int[10];
        int [] sale = new int[10];
        int maxProfit = 0;
        String purchaseDay= "";
        String saleDay= "";

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter "+(i+1)+". day purchase price:");
            purchase[i] =scan.nextInt();
            System.out.println("Enter "+(i+1)+". day sale price:");
            sale[i] =scan.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10 ; j++) {
                if ((sale[j]-purchase[i])>maxProfit){
                    maxProfit = sale[j]-purchase[i];
                    purchaseDay = ""+(i+1);
                    saleDay = ""+(j+1);
                }
            }
        }
        System.out.println("Max profit is: " + maxProfit+ "$\nThe purchase day is: " + purchaseDay+ "\nThe sale day is: " +saleDay);
    }
}

/*
I want to share one real interview question friends (Question was asked my friend). Question is you have 10 days purchase and sale prices.
 Write a code and find which days you should buy and sell this product.  My code is here:
 */
