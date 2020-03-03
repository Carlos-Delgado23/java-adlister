import java.util.ArrayList;
import java.util.List;

public class ListItemsDao implements Items {
    private List<Item> items;

    public List<Item> all(){
        if (items == null){
            items = generateItems();
        }
        return items;
    }

    private List<Item> generateItems(){
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Air Force Ones", 75.00));
        items.add(new Item(23, "Nike mid-high Socks", 15.00));
        items.add(new Item(45, "Bulls Jersey", 99.00));
        items.add(new Item(2, "AAPE Camo Smock Jacket", 295.00));
        items.add(new Item(20, "Adidas Hamburg", 109.00));
        items.add(new Item(15, "Nike x Undercover Air Max", 129.00));
        items.add(new Item(10, "Champion Reverse Weave Script Hoody", 69.00));
        items.add(new Item(8, "Adidas Adilette", 29.00));
        items.add(new Item(5, "Nike Air Max 720", 119.00));
        items.add(new Item(18, "Nike ACG All Over Print Shirt", 55.00));
        return items;
    }
}
