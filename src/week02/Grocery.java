package week02;

public class Grocery extends Product implements DeliveryChargeCalculator {
    String size = "various";
    Grocery(String name, int price, double weight) {
        super(name, price, weight);
    }


    @Override
    public int getDeliveryCharge(double weight, int price) {
        int charge = 0;
        if (weight < 3) {
            charge += 1000;
        } else if (weight < 10) {
            charge += 5000;
        } else {
            charge += 10000;
        }

        if (price > 100000) {
            return 0;
        } else if (price > 30000) {
            return charge - 1000;
        } else {
            return charge;
        }
    }
}
