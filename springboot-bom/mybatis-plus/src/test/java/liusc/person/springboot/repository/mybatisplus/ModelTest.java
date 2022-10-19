package liusc.person.springboot.repository.mybatisplus;

import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import org.junit.jupiter.api.Test;

/**
 * model 类扩展实体类 crud
 *
 * @author LiuShiChen
 * @date 2022/10/19 10:34:37
 **/
public class ModelTest extends MybatisPlusApplicationTests {

    @Test
    public void testAdd() {
        new UserDO().setId(5L).setName("liusc").updateById();
    }
}
