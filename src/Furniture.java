public class Furniture extends Product {
    private final static double TAX_RATE = 0.08;
    public Furniture(String name, int stockQuantity, double unitPrice) {
        super(name, stockQuantity, unitPrice);
    }
    @Override
    public double calculateTotalPrice() {

        return getUnitPrice()*(1+TAX_RATE);
    }
}
