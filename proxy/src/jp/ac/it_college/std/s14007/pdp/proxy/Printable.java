package jp.ac.it_college.std.s14007.pdp.proxy;

/**
 * Created by s14007 on 15/06/18.
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
