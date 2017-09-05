package com.wetest.composite.element;

import com.wetest.composite.Component;

/**
 * Created by wangjianqiang on 2017/8/16.
 */
public class Button implements Component {
    @Override
    public void addComponent(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void click() {
        System.out.println("按钮单击");
    }

    @Override
    public void doubClick() {
        System.out.println("按钮双击");
    }
}
