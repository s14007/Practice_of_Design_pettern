package jp.ac.it_college.std.s14007.pdp.composite;

/**
 * Created by s14007 on 15/06/16.
 */
public class File extends Entry {
    private String name;
    private int size;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/"  + this);
    }
}
