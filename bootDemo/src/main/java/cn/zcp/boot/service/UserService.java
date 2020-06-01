package cn.zcp.boot.service;

import cn.zcp.boot.mapper.UserMapper;
import cn.zcp.boot.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserInfo findById(String id){
        UserInfo info = new UserInfo();
        info.setId("1111");
        return userMapper.selectOne(info);
    }
}
