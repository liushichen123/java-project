package liusc.person.springboot.repository.mybatisplus.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户 - 持久层接口
 *
 * @author LiuShiChen
 * @date 2022/10/18 14:25:32
 **/
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
