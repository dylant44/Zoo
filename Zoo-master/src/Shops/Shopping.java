package Shops;

import java.util.Scanner;

public interface Shopping
{
    String[] products = new String[1];
    int defaultPrice = 10;

    static void populateProducts()
    {
        products[0] = "toy";
    }

    static void checkout(Scanner input)
    {
        System.out.println("Products: ");
        for (String product : products)
        {
            System.out.print(product + ",");
        }
        System.out.println(">");
        sellProduct(input.nextLine());
    };

    static String sellProduct(String product)
    {
        Wallet.subtract(defaultPrice);
        return "You purchased the " + product + ". Your new balance is $" + Wallet.getMoney();
    };
}