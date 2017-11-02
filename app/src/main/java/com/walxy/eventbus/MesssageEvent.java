package com.walxy.eventbus;

/**
 * 作者：王兵洋 on 2017/11/2 08:26
 * 类的作用： 定义消息事件类
 */
public class MesssageEvent {

    private String message;

    public MesssageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
