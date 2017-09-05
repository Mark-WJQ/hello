package com.wetest.decorator;

/**
 * Created by wangjianqiang on 2017/8/30.
 */
public class RevertDecorator extends Decorator {


    public RevertDecorator(Component component) {
        super(component);
    }

    @Override
    public String encrypt() {
        String str = component.encrypt() + ":revert";
        System.out.println("逆向输出加密:" + str);
        return str;
    }
}
