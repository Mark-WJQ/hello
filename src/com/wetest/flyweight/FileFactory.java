package com.wetest.flyweight;

import java.util.Hashtable;
import java.util.Objects;

/**
 *
 * 享元工厂
 * Created by wangjianqiang on 2017/9/11.
 */
public class FileFactory {

    private static FileFactory ff;

    Hashtable<String,File> files = new Hashtable<>();

    public FileFactory() {
        files.put("image",new Image());
        files.put("video",new Video());

    }

    private FileFactory getInstance(){
        if (Objects.isNull(ff))
            ff = new FileFactory();
        return ff;
    }



    public File getFile(String name){
        if (!files.containsKey(name)){
            return null;
        }
        return files.get(name);
    }



}
