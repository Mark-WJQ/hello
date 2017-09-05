package com.wetest.decorator;

/**
 * Created by wangjianqiang on 2017/8/30.
 */
public class EncryptCompent implements Component {

    private String data;
    private String key;

    public EncryptCompent(String data, String key) {
        this.data = data;
        this.key = key;
    }

    @Override
    public String encrypt() {

        String str = "{" + this.data + this.key +"}";
        System.out.println("首次加密:" + str);
        return str;
    }
}
