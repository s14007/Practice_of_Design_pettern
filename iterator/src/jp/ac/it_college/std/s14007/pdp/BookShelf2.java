package jp.ac.it_college.std.s14007.pdp;

import java.util.ArrayList;

/**
 * Created by s14007 on 15/06/02.
 */
public class BookShelf2 extends BookShelf implements Aggregate{
    private ArrayList books = new ArrayList();
    //private Book[] books;
    private int last = 0;

    public BookShelf2(int maxsize) {
        super(maxsize);
        this.books = new ArrayList(maxsize);
    }

    public Book getBookAt(int index) {
        return (Book)books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
