package com.gem.demo.service;

import com.gem.demo.entity.Message;
import com.gem.demo.entity.MessageCatory;

import java.util.List;

public interface MessageService {

    //获得所有的类型
    public List<MessageCatory> getallMessageCatory();

    //根据类型获得该类型下的消息
    //根据类别号获得该类别下的所有问题
    public List<Message> getMessageByCatory(int catoryId);

    //根据问题号获得答案

    public String getAnswerById(int messageId);
}
