package jp.ac.it_college.std.s14007.pdp.factory.idcard;

import jp.ac.it_college.std.s14007.pdp.factory.framework.Factory;
import jp.ac.it_college.std.s14007.pdp.factory.framework.Product;

import java.util.*;

/**
 * Created by s14007 on 15/06/04.
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
