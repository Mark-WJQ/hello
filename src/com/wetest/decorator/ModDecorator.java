package com.wetest.decorator;

/**
 * Created by wangjianqiang on 2017/8/30.
 */
public class ModDecorator extends Decorator {
    public ModDecorator(Component component) {
        super(component);
    }

    @Override
    public String encrypt() {

        String str = component.encrypt() + ":mod";
        System.out.println("求模加密:" + str);
        othermethod();
        return str;
    }

    public void othermethod(){
        System.out.println("dosomething");
    }
}
