package cn.zcp.boot.mapper;


import cn.zcp.boot.pojo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        UserInfo info = new UserInfo();
        info.setId("1111");
        UserInfo userInfo = userMapper.selectOne(info);
        List<UserInfo> userInfos = userMapper.selectAll();
        System.out.println(userInfos);
    }
}