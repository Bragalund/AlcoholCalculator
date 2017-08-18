package AllTheAlcohol;

import java.util.Scanner;

public class Input {

    public Input() {
    }

    public String formatInput(String text) {
        text.toLowerCase();
        text.replace(",", ".");
        return text;
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        formatInput(text);
        return text;
    }

    public int getPrice() {
        System.out.println("Write the price: ");
        int price = 0;
        try {
            price = Integer.parseInt(getInput());
        } catch (NumberFormatException e) {
            System.out.println("Write an int.");
            getPrice();
        }
        return price;
    }

    public String getName() {
        System.out.println("Write the name: ");
        String name = getInput();
        return name;
    }

    public int getAmount() {
        System.out.println("Write the amount of the beverage in milliliters: (example: 0,5L = 500)");
        int amount = 0;
        try {
            amount = Integer.parseInt(getInput());
        } catch (NumberFormatException e) {
            System.out.println("Write a number.");
            getAmount();
        }
        return amount;
    }

    public double getAvgAlcoholAmount() {
        System.out.println("Write the average alcohol percentage: example: 4.7");
        double avgAlcoholContent = 0.0;
        try {
            avgAlcoholContent = Double.parseDouble(getInput());
        } catch (NumberFormatException e) {
            System.out.println("Write a decimalnumber with punctuation as delimiter.");
            getAvgAlcoholAmount();
        }
        return avgAlcoholContent;
    }

    @Override
    public String toString() {
        return "Input{}";
    }
}
