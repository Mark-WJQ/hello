package com.wetest.flyweight;

/**
 * Created by wangjianqiang on 2017/9/11.
 */
public class ConcreteOp implements Operation {
    @Override
    public void display(File file, Describe describe) {
        System.out.println("File:"+file.getName()+";"+ describe);
    }
}
