package Prototype.StudyCode;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;

        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(10.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setNumberPages(365);
        book.setPrice(10.99);
        items.put("Book", book);
    }

}
