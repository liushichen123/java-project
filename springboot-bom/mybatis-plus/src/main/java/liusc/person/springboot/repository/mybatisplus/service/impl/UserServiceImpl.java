package liusc.person.springboot.repository.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import liusc.person.springboot.repository.mybatisplus.repository.mapper.UserMapper;
import liusc.person.springboot.repository.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户 - 服务层接口实现类
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:25:05
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
}
