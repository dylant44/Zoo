package Shops;

import java.util.Scanner;

public class Gift_Shop implements Shopping
{
    private static String[] products = {"toy","shirt","hoodie","flip flops","monkey socks","safari hat",
            "keychain", "coaster", "trinket","action figure"};

    public static String checkout(Scanner input)
    {
        System.out.println("Products: ");
        for (String product : products)
        {
            System.out.print(product + ", ");
        }
        return sellProduct(input.nextLine());
    }

    public static String sellProduct(String product)
    {
        Wallet.subtract(5);
        return "You purchased the " + product + ". Your new balance is $" + Wallet.getMoney();
    }
}