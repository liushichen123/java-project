package liusc.person.springboot.repository.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import org.junit.jupiter.api.Test;

/**
 * 乐观锁插件使用
 *
 * @author LiuShiChen
 * @date 2022/10/19 15:20:33
 **/
public class OptimisticLockerTest extends SpringbootApplicationTests {

    @Test
    public void update() {
        userService.update(new UserDO().setName("PDwSdsP").setAge(24), new QueryWrapper<UserDO>().eq("id", 1582546123164270608L));
    }

}
