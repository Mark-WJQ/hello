package com.wetest.composite.element;

import com.wetest.composite.Component;
import com.wetest.composite.exception.ComponentException;

/**
 * Created by wangjianqiang on 2017/8/16.
 */
public class TextFrame implements Component {
    @Override
    public void addComponent(Component component) throws ComponentException {
        throw new ComponentException("叶子节点不可调用");
    }

    @Override
    public void remove(Component component) throws ComponentException {
        throw new ComponentException("叶子节点不可调用");
    }

    @Override
    public void click() {
        System.out.println("文本框单击！");
    }

    @Override
    public void doubClick() {
        System.out.println("文本框双击！");
    }
}
