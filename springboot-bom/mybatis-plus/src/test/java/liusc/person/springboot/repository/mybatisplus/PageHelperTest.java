package liusc.person.springboot.repository.mybatisplus;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import liusc.person.springboot.repository.mybatisplus.controller.command.UserQuery;
import liusc.person.springboot.repository.mybatisplus.controller.vo.UserVO;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * pageHelper 测试类
 *
 * @author LiuShiChen
 * @date 2022/10/19 15:50:28
 **/
public class PageHelperTest extends SpringbootApplicationTests {

    @Test
    public void page() {
        PageHelper.startPage(2, 2, "id desc");
        List<UserVO> userVOList = userMapper.findList(new UserQuery());
        PageInfo<UserVO> pageInfo = new PageInfo<>(userVOList);
        System.out.println(userVOList);
    }
}
