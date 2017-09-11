package com.wetest.flyweight;

import com.wetest.absartFactory.factory.FactoryInterface;

/**
 * Created by wangjianqiang on 2017/9/11.
 */
public class Client {


    public static void main(String[] args) {
        FileFactory fileFactory = new FileFactory();
        File file = fileFactory.getFile("image");
        Describe describe = new Describe();
        describe.setSize(100);
        describe.setX(10);
        describe.setY(20);

        Operation op = new ConcreteOp();
        op.display(file,describe);
    }
}
