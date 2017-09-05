package com.wetest.composite.composite;

import com.wetest.composite.Component;
import com.wetest.composite.exception.ComponentException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjianqiang on 2017/8/16.
 */
public class MiddlePanel implements Component {

    List<Component> componentList;
    @Override
    public void addComponent(Component component) throws ComponentException {
        if (componentList == null)
            componentList = new ArrayList<>();
        componentList.add(component);
    }

    @Override
    public void remove(Component component) throws ComponentException {

    }

    @Override
    public void click() {
        System.out.println("单击MiddlePanel");
    }

    @Override
    public void doubClick() {
        System.out.println("双击MiddlePanel");
        for (Component composite:componentList){
            composite.click();
        }
    }
}
