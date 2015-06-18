package jp.ac.it_college.std.s14007.pdp.abstractfactory.factory;

import jp.ac.it_college.std.s14007.pdp.abstractfactory.listfactory.ListLink;

/**
 * Created by s14007 on 15/06/13.
 */
public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("クラス" + classname + "が見つかりません");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);


}
