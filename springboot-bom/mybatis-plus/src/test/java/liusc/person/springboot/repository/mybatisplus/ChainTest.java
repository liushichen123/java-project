package liusc.person.springboot.repository.mybatisplus;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import liusc.person.springboot.repository.mybatisplus.repository.mapper.UserMapper;
import liusc.person.springboot.repository.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * 链式调用测试类
 *
 * @author LiuShiChen
 * @date 2022/10/19 10:01:21
 **/
public class ChainTest extends SpringbootApplicationTests {

    @Resource
    public UserMapper userMapper;

    @Resource
    public UserService userService;

    @Test
    public void testChain() {
        System.out.println(("----- testChain method test ------"));
        QueryChainWrapper<UserDO> chainWrapper = new QueryChainWrapper(userMapper);
        List<UserDO> list = chainWrapper.eq("name", "liusc").list();
        System.out.println(list);
    }

    @Test
    public void testLambdaChain() {
        System.out.println(("----- testLambdaChain method test ------"));
        LambdaQueryChainWrapper<UserDO> lambdaWrapper = new LambdaQueryChainWrapper<>(userMapper);
        List<UserDO> list = lambdaWrapper.eq(UserDO::getName, "liusc").list();
        System.out.println(list);
    }
}
