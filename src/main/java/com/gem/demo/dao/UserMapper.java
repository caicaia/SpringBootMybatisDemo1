package com.gem.demo.dao;



import com.gem.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserMapper {
    //查询所有的user对象
    public List<User> userList();
}
