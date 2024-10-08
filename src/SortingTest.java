import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortingTest {
    @Test
    public void testSortingByTotalPrice(){
    List<Product> products = new ArrayList<>();
        products.add(ProductFactory.createProduct("electronic","IPS" ,12000,2 ));
        products.add(ProductFactory.createProduct("electronic","LED" ,20000,1 ));
        products.add(ProductFactory.createProduct("clothing","Pant" ,1100,20 ));
        OrderManager om = new OrderManager();
        om.sortProducts(products);
        assertEquals("Pant",products.get(0).getName());
        assertEquals("IPS",products.get(1).getName());
        assertEquals("LED",products.get(2).getName());
    }
    @Test
    public void testSortingByName(){
        List<Product> products = new ArrayList<>();
        products.add(ProductFactory.createProduct("electronic","IPS" ,12342.00,12 ));
        products.add(ProductFactory.createProduct("clothing","Lungi" ,350.00,7 ));
        products.add(ProductFactory.createProduct("electronic","iPAD" ,85900.01,1 ));
        products.add(ProductFactory.createProduct("furniture","BED" ,17800.00,2 ));
        OrderManager om = new OrderManager();
        om.sortProducts(products);
    }
    @Test
    public void testSortingByUnitPrice(){
        List<Product> products = new ArrayList<>();
        products.add(ProductFactory.createProduct("electronic","DESKTOP" ,87990.00,1 ));
        products.add(ProductFactory.createProduct("electronic","SmartPhone" ,89131.00,1 ));
        products.add(ProductFactory.createProduct("clothing","PoloShirt" ,1990.69,3 ));
        products.add(ProductFactory.createProduct("clothing","Lungi" ,350.00,7 ));
        products.add(ProductFactory.createProduct("electronic","iPAD" ,85900.01,1 ));
        products.add(ProductFactory.createProduct("furniture","BED" ,17800.00,2 ));
        OrderManager om = new OrderManager();
        om.sortProducts(products);
    }
    @Test
    public void testSortingByStockQuantity() {
        List<Product> productList = new ArrayList<>();
        productList.add(ProductFactory.createProduct("furniture", "Chair", 5, 11));
        productList.add(ProductFactory.createProduct("furniture", "Chair", 5, 12));
        productList.add(ProductFactory.createProduct("furniture", "Chair", 5, 10));
        OrderManager orderManager = new OrderManager();
        orderManager.sortProducts(productList);
        assertEquals(10, productList.get(0).getStockQuantity());
        assertEquals(11, productList.get(1).getStockQuantity());
        assertEquals(12, productList.get(2).getStockQuantity());

    }
}
