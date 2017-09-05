package com.wetest.decorator;

/**
 * Created by wangjianqiang on 2017/8/30.
 */
public abstract class Decorator implements Component {
    protected Component component;
    public Decorator(Component component) {
        this.component = component;
    }

}
