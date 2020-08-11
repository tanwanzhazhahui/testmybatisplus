package com.testmybatisplus;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.testmybatisplus.mapper.UserMapper;
import com.testmybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class TestmybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("哈哈哈");
        user.setAge(9);
        user.setEmail("2538975899@qq.com");
        int result = userMapper.insert(user);
        System.out.println(result);
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(Long.valueOf("7"));
        user.setName("来嘛,拉出来嘛");
        user.setAge(16);
        user.setEmail("2538975899@qq.com");
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

    @Test
    public void testVersion(){
        User user = userMapper.selectById(Long.valueOf("1"));
        user.setName("梅西");
        user.setEmail("392143528@qq.com");
        userMapper.updateById(user);

    }

    @Test
    public void testVersion2(){
        User user = userMapper.selectById(Long.valueOf("1"));
        user.setName("本泽马");
        user.setEmail("392143528@qq.com");

        User user2 = userMapper.selectById(Long.valueOf("1"));
        user2.setName("C罗");
        user2.setEmail("392143528@qq.com");

        userMapper.updateById(user2);
        userMapper.updateById(user);
    }

    @Test
    public void testSelectById(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id","1L");
        List<User> userList = userMapper.selectByMap(map);
        for (User user : userList) {
            System.out.println(user);
        }

    }

    @Test
    public void testPage(){
        Page<User> page = new Page<>(1,5);
        userMapper.selectPage(page,null);
        System.out.println(page.getTotal());
        for (User user : page.getRecords()) {
            System.out.println(user);
        }
    }

    @Test
    public void testDelete(){
//        userMapper.deleteById(Long.valueOf("7"));
//        userMapper.deleteBatchIds(Arrays.asList());

    }


}
