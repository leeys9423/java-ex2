package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + quantity);
    }

    public void minus(Product product, int quantity) {
        if (quantity >= cartMap.get(product)) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, cartMap.get(product) - quantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> product : cartMap.entrySet()) {
            System.out.println("상품: " + product.getKey() + " 수량: " + product.getValue());
        }
    }
}
