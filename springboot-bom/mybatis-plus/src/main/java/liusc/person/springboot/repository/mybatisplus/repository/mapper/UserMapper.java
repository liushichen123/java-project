package liusc.person.springboot.repository.mybatisplus.repository.mapper;

import liusc.person.springboot.repository.mybatisplus.controller.command.UserQuery;
import liusc.person.springboot.repository.mybatisplus.controller.vo.UserVO;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户 - 持久层接口
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:25:32
 **/
@Mapper
@Repository
public interface UserMapper extends PageMapper<UserVO, UserDO> {

    /**
     * 查询所有
     *
     * @param userQuery 用户查询参数
     * @return user 集合
     */
    List<UserVO> findList(UserQuery userQuery);
}
