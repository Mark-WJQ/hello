package com.wetest.decorator;

/**
 * Created by wangjianqiang on 2017/8/30.
 */
public class Client {

    public static void main(String[] args) {
        Component component;

        component = new EncryptCompent("aaaaaaa","ssss");
        RevertDecorator d1 = new RevertDecorator(component);
        ModDecorator d2 = new ModDecorator(d1);
        ModDecorator d3 = new ModDecorator(d2);
        d3.encrypt();
        d2.othermethod();
        d3.othermethod();
    }
}
