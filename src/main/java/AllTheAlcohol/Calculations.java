package AllTheAlcohol;

import java.util.ArrayList;

public class Calculations {

    public Calculations() {

    }

    public ArrayList<Drink> addDrink(ArrayList<Drink> drinks) {
        Input input = new Input();
        Drink drink = new Drink(input.getName(), input.getPrice(), input.getAvgAlcoholAmount(), input.getAmount());
        drinks.add(drink);
        return drinks;
    }

    public ArrayList sortDrinks(ArrayList<Drink> drinks) {

        quickSort(drinks,0,drinks.size()-1);
        return drinks;
    }

    public static void quickSort(ArrayList<Drink> drinks, int lo, int hi){
        if(hi<=lo)return;
        int j = partition(drinks,lo,hi);
        quickSort(drinks, lo, j-1);
        quickSort(drinks, j+1, hi);
    }

    public static int partition(ArrayList<Drink> drinks, int lo, int hi){
        int i=lo;
        int j= hi+1;
        double someSample=drinks.get(lo).getAlcoholPricePerMilliliter();
        while (true){
            while (drinks.get(++i).getAlcoholPricePerMilliliter()>someSample){if(i==hi)break;}
            while (someSample>drinks.get(--j).getAlcoholPricePerMilliliter()){if (j==lo)break;}
            if (i>=j)break;
            Drink temp1=drinks.get(j);
            drinks.set(j,drinks.get(i));
            drinks.set(i,temp1);
        }
        Drink temp=drinks.get(j);
        drinks.set(j,drinks.get(lo));
        drinks.set(lo,temp);
        return j;
    }

    @Override
    public String toString() {
        return "Calculations{}";
    }
}
