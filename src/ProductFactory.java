public class ProductFactory {
    public static Product createProduct(String type, String name, double unitPrice, int stockQuantity){
    if(type.equalsIgnoreCase("electronic")){
           return new Electronics(name, stockQuantity, unitPrice);
        }
        else if(type.equalsIgnoreCase("clothing")) {
        return new Clothing(name, stockQuantity, unitPrice);
    }
        else if (type.equalsIgnoreCase("furniture")) {
            return new Electronics(name, stockQuantity, unitPrice);
        }
        return null;
    }

}
