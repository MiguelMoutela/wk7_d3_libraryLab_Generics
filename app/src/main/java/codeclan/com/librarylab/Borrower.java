package codeclan.com.librarylab;

import java.util.ArrayList;

/**
 * Created by user on 08/11/2017.
 */

public class Borrower<T> {
    private String name;
    private ArrayList<T>borrowed;

    public Borrower(String name) {
        this.name = name;
        this.borrowed = new ArrayList<>();
    }
    public void borrowItem(T item) {
        borrowed.add(item);
    }

}
