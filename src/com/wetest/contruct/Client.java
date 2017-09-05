package com.wetest.contruct;

import com.wetest.contruct.builder.VideoPlayerInterface;
import com.wetest.contruct.director.Director;
import com.wetest.util.PropertiesUtil;

/**
 * Created by wangjianqiang on 2017/7/11.
 */
public class Client {


    public static void main(String[] args) {

        String player = PropertiesUtil.getvalue("builder");
        VideoPlayerInterface videoPlayer = null;
        try {
            videoPlayer = (VideoPlayerInterface)Class.forName(player).newInstance();
            Director.build(videoPlayer);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
