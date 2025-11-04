package com.pluralsight.finance;

public class FinanceApplication {

    public static void main(String[] args) {

        System.out.println("===== List of Portfolio's =====");

        Portfolio portfolio1 = new Portfolio("Harry Potter's Net worth","Harry Potter");
        portfolio1.add(new CheckingAccount("Checking", "4444", 500_000));
        portfolio1.add(new CreditCard("Credit Card", "3333", 4000));
        portfolio1.add(new Gold("Gold Coins", 200, 5));
        portfolio1.add(new House("Vacay house", 100_000, 2025, 3000, 20));
        portfolio1.add(new Jewelry("Necklace", 3000, 5));

        System.out.println(portfolio1);

        Portfolio portfolio2 = new Portfolio("Hello Kitty's Net worth","Hello Kitty");
        portfolio2.add(new House("Family House", 600_000, 1890, 5000, 40));

        System.out.println(portfolio2);
    }


}
