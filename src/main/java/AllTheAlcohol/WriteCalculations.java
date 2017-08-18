package AllTheAlcohol;

import java.util.ArrayList;

public class WriteCalculations {
    public WriteCalculations() {

    }

    public void writeInfoAboutDrinks(ArrayList<Drink> drinks) {
        for (int i = 1; i <= drinks.size(); i++) {
            Drink drink = drinks.get(drinks.size() - i);
            System.out.println((i) + ".place:   " + drink.getName() + "  har " + drink.getAlcoholPricePerMilliliter() + " kroner per milliliter.");
        }
    }

    @Override
    public String toString() {
        return "WriteCalculations{}";
    }
}
