package com.testmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.testmybatisplus.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

}
