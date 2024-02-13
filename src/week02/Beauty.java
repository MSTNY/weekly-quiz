package week02;

public class Beauty extends Product implements DeliveryChargeCalculator{
    String size = "small";
    Beauty(String name, int price, double weight) {
        super(name, price, weight);
    }

    @Override
    public int getDeliveryCharge(double weight, int price) {
        int charge = 1000;
        if (price > 30000) {
            charge -= 1000;
            return charge;
        } else {
            return charge;
        }
    }
}
