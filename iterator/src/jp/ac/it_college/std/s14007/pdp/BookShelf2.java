package jp.ac.it_college.std.s14007.pdp;

import java.util.ArrayList;

/**
 * Created by s14007 on 15/06/02.
 */
public class BookShelf2 extends BookShelf implements Aggregate{
    private ArrayList list = new ArrayList();
    private Book[] books;
    private int last = 0;

    public BookShelf2(int maxsize) {
        super(maxsize);
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
