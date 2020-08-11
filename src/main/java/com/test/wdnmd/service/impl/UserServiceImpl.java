package com.test.wdnmd.service.impl;

import com.test.wdnmd.vo.User;
import com.test.wdnmd.dao.UserMapper;
import com.test.wdnmd.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 小俊
 * @since 2020-07-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
