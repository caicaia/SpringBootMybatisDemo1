package com.gem.demo.control;

import com.gem.demo.entity.Message;
import com.gem.demo.entity.MessageCatory;
import com.gem.demo.entity.User;
import com.gem.demo.service.MessageService;
import com.gem.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class UserControl {
    @Autowired
    private UserService service;

    @Autowired
    private MessageService messageService;

    @RequestMapping("/userInfors")
    public List<User> getAllUser(){
        //无jsp，将返回值以json的形式在页面显示
        return service.userList();

    }
@RequestMapping("/talk")
    public void talk(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//获得类型，并以域对象的形式发送到jsp中
    List<MessageCatory> catories=messageService.getallMessageCatory();
    request.setAttribute("messageCatory",catories);
    request.getRequestDispatcher("/talk.jsp").forward(request,response);
    }

    @RequestMapping("/selectMessages")
    public List<Message> selectMessages(int id,HttpServletRequest request, HttpServletResponse response) {
        List<Message> messages=messageService.getMessageByCatory(id);
        return messages;
    }
}
