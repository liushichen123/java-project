package liusc.person.springboot.repository.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 条件构造器测试类
 *
 * @author LiuShiChen
 * @date 2022/10/19 11:27:17
 **/
public class WrapperTest extends SpringbootApplicationTests {

    @Test
    public void testAllEq() {
        QueryWrapper<UserDO> queryWrapper = new QueryWrapper<>();
    }
}
