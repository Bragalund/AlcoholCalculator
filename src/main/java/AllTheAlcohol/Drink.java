package AllTheAlcohol;

public class Drink {
    private int price, amount;
    private double percent, alcoholPricePerMilliliter;
    private String name;

    public Drink(String name, int price, double percent, int amount) {
        this.name = name;
        this.price = price;
        this.percent = percent;
        this.amount = amount;
        this.alcoholPricePerMilliliter = calculateAlcoholPricePerMilliliter();
    }

    public double calculateAlcoholPricePerMilliliter() {
        double alcoholPricePerMilliliter = price / (amount * (percent / 100));
        return alcoholPricePerMilliliter;
    }

    //Getters and setters
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAlcoholPricePerMilliliter() {
        return alcoholPricePerMilliliter;
    }

    public void setAlcoholPricePerMilliliter(double alcoholPricePerMilliliter) {
        this.alcoholPricePerMilliliter = alcoholPricePerMilliliter;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                ", amount=" + amount +
                ", percent=" + percent +
                ", alcoholPricePerMilliliter=" + alcoholPricePerMilliliter +
                ", name='" + name + '\'' +
                '}';
    }
}
