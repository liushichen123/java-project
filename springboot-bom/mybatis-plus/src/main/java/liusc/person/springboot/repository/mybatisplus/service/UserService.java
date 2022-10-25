package liusc.person.springboot.repository.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import liusc.person.springboot.repository.mybatisplus.controller.command.UserQuery;
import liusc.person.springboot.repository.mybatisplus.controller.vo.UserVO;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;

/**
 * 用户 - 服务层接口
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:24:34
 **/
public interface UserService extends PageService<UserVO, UserDO> {

}
