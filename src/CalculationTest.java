import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculationTest {
    @Test
    public void testTaxForElectronics() {
        Product phone = ProductFactory.createProduct("electronics", "Phone", 20, 700);
        double taxRate = 0.15;
        double expectedTax = 700 * taxRate;
        double totalPrice = phone.calculateTotalPrice();
        double calculatedTax = totalPrice - phone.getUnitPrice();
        assertEquals(expectedTax, calculatedTax, 0.01);
    }
    @Test
    public void testTaxForClothing() {
        Product tShirt = ProductFactory.createProduct("clothing", "T-Shirt", 50, 20);
        double taxRate = 0.10;
        double expectedTax = 20*taxRate;
        double totalPrice = tShirt.calculateTotalPrice();
        double calculatedTax = totalPrice - tShirt.getUnitPrice();
        assertEquals(expectedTax, calculatedTax, 0.01);
    }
    @Test
    public void testTaxForFurniture() {
        Product table = ProductFactory.createProduct("furniture", "Table", 8, 250);
        double taxRate = 0.08;
        double expectedTax = 250 * taxRate;
        double totalPrice = table.calculateTotalPrice();
        double calculatedTax = totalPrice - table.getUnitPrice();
        assertEquals(expectedTax, calculatedTax, 0.01);
    }
}

