import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class OrderManager {
public void sortProducts(List<Product> productList){
    Collections.sort(productList,
            Comparator.comparingDouble(Product::calculateTotalPrice)
                        .thenComparing(Product::getName)
                        .thenComparing(Product::getStockQuantity));
}
}
