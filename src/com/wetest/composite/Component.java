package com.wetest.composite;

import com.wetest.composite.exception.ComponentException;

/**
 * Created by wangjianqiang on 2017/8/16.
 */
public interface Component {

    void addComponent(Component component) throws ComponentException;

    void remove(Component component) throws ComponentException;

    void click();

    void doubClick();


}
