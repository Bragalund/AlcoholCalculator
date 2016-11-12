package AllTheAlcohol;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Drink> drinks = new ArrayList<Drink>();
        Calculations calculations = new Calculations();
        boolean moreInput = true;
        while (moreInput){
            System.out.println("\n"+"Add a drink to the program.");
            calculations.addDrink(drinks);
            System.out.println("Write c to calculate. Write anything else to add another drink.");
            Input input = new Input();
            if(input.getInput().equals("c")){
                moreInput=false;
            }
        }
        calculations.sortDrinks(drinks);
        WriteCalculations writeCalculations= new WriteCalculations();
        writeCalculations.writeInfoAboutDrinks(drinks);


    }

    @Override
    public String toString() {
        return "App{}";
    }
}
