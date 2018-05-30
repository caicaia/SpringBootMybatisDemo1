package com.gem.demo.dao;

import com.gem.demo.entity.MessageCatory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MessageCatoryMapper {
    //获得所有的类别  在初始页面显示
    public List<MessageCatory> getallMessageCatory();

}
