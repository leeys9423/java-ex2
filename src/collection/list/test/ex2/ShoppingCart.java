package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println("상품명:" + items.get(i).getName() + ", 합계:" + items.get(i).getTotalPrice());
            total += items.get(i).getTotalPrice();
        }
        System.out.println("전체 가격 합:" + total);
    }
}
