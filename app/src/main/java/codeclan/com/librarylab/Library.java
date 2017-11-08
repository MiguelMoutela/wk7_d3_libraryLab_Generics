package codeclan.com.librarylab;

import java.util.ArrayList;

/**
 * Created by user on 08/11/2017.
 */

public class Library<T> {
    private ArrayList<T> contents;


    public Library() {
        contents = new ArrayList<>();
    }

    public void addToLibrary(T item) {
        contents.add(item);
    }

    public int getSize() {
        return contents.size();
    }

    public void lendItem(T item, Borrower borrower) {
        contents.remove(item);
        borrower.borrowItem(item);
    }
}
