package Library_Catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog<T extends LibraryItem<?>> {
    private List<T> items;

    public Catalog() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        if (items.contains(item)) {
            items.remove(item);
        } else {
            System.out.println("Item not found in the catalog.");
        }
    }

    public List<T> getItems() {
        return items;
    }

    public void displayCatalog() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
