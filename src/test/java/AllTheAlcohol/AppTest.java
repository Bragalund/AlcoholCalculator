package AllTheAlcohol;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class AppTest extends TestCase {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }


    @Test
    public void testDrinkGetName(){
        //Arrange
        String testString = "Øl";
        Drink drink1 = new Drink("Øl",50,5,500);
        //Act
        String noe = drink1.getName();
        //Assert
        assertEquals(testString,noe);}

    @Test
    public void testDrinkComparePricePrML(){
        //Arrange
        Drink drink1 = new Drink("Øl",50,5,500);
        Drink drink2 = new Drink("Sprit",60,5,500);
        ArrayList<Drink> drinks = new ArrayList<Drink>();
        drinks.add(drink1);
        drinks.add(drink2);
        Calculations calculations=new Calculations();
        ArrayList sortDrinks = calculations.sortDrinks(drinks);
        //Act
        Drink drink3= (Drink) sortDrinks.get(1);
        //Assert
        assertEquals(drink1, drink3);
    }



    @Test
    public void testWriteInfoAboutDrinks(){

        //Arrange
        ArrayList<Drink> drinks = new ArrayList<Drink>();
        drinks.add(new Drink("Lager",500,7,500));
        drinks.add(new Drink("Sprit",60,5,500));
        drinks.add(new Drink("Vin",55,12.5,200));
        drinks.add(new Drink("Øl",50,5,500));
        WriteCalculations writeCalculations= new WriteCalculations();

        //Act
        setUpStreams();
        writeCalculations.writeInfoAboutDrinks(drinks);
        cleanUpStreams();
        //Assert
        assertEquals("1.place:   Øl  har 2.0 kroner per milliliter.\n" +
                "2.place:   Vin  har 2.2 kroner per milliliter.\n" +
                "3.place:   Sprit  har 2.4 kroner per milliliter.\n" +
                "4.place:   Lager  har 14.285714285714286 kroner per milliliter.\n",outContent.toString());
    }


}


