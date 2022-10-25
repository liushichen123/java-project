package liusc.person.springboot.repository.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import liusc.person.springboot.repository.mybatisplus.controller.command.UserQuery;
import liusc.person.springboot.repository.mybatisplus.controller.vo.UserVO;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import liusc.person.springboot.repository.mybatisplus.repository.mapper.PageMapper;
import liusc.person.springboot.repository.mybatisplus.repository.mapper.UserMapper;
import liusc.person.springboot.repository.mybatisplus.service.UserService;
import liusc.person.springboot.repository.mybatisplus.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户 - 服务层接口实现类
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:25:05
 **/
@Service
public class UserServiceImpl extends PageServiceImpl<UserVO, UserMapper, UserDO> implements UserService {

    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        super(userMapper);
    }
}
