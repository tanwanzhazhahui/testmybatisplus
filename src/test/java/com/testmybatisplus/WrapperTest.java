package com.testmybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.testmybatisplus.mapper.UserMapper;
import com.testmybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class WrapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .isNotNull("name")
                .isNotNull("email")
                .ge("age",12);
        userMapper.selectList(wrapper).forEach(System.out::println);
    }

    @Test
    void test1(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name","我傻了");
        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    @Test
    void test2(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("age",10,20);
        Integer count = userMapper.selectCount(wrapper);
        System.out.println(count);
    }

    @Test
    void test3(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.notLike("name","a");
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);
    }

    @Test
    void test4(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.inSql("id","select id from user where id<4");
        List<Object> objects = userMapper.selectObjs(wrapper);
        objects.forEach(System.out::println);
    }
}
