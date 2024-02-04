package week2;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{
    String size = "large";

    LargeAppliance(String name, int price, double weight) {
        super(name, price, weight);
    }

    @Override
    public int getDeliveryCharge(double weight, int price) {
        return 0;
    }
}
