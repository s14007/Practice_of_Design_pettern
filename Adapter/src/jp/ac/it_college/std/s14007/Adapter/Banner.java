package jp.ac.it_college.std.s14007.Adapter;

/**
 * Created by s14007 on 15/06/03.
 */
public class Banner {
    private String string;
    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
