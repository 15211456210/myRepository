package cn.zcp.boot.web;

import cn.zcp.boot.pojo.UserInfo;
import cn.zcp.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

@RestController
@RequestMapping("user")
public class HelloController {

    @Autowired
    private UserService userService;
    @GetMapping("{id}")
    public UserInfo hello(@PathVariable("id")String id){
        return userService.findById(id);
    }
}
