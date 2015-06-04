package jp.ac.it_college.std.s14007.pdp.factory.idcard;

import jp.ac.it_college.std.s14007.pdp.factory.framework.Product;

/**
 * Created by s14007 on 15/06/04.
 */
public class IDCard2 extends Product {
    private int number;
    private String owner;

    IDCard2(int number, String owner) {
        System.out.println(number + "番" + owner + "のカードを作ります");
        this.number = number;
        this.owner = owner;

    }

    public void use() {
        System.out.println(number + owner + "のカードを使います");
    }

    public  int getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }
}
