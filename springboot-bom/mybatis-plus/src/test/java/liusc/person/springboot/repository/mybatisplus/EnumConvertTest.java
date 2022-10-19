package liusc.person.springboot.repository.mybatisplus;

import liusc.person.springboot.repository.mybatisplus.domain.User;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

/**
 * 枚举序列化转换
 *
 * @author LiuShiChen
 * @date 2022/10/19 14:14:41
 **/
public class EnumConvertTest extends SpringbootApplicationTests {

    @Test
    public void testConvert() {
        UserDO userDO = userService.getById(1582546123164270604L);
        System.out.println("转换前 ----- " + userDO);
        User user = new User();
        BeanUtils.copyProperties(userDO, user);
        System.out.println("转换后 ----- " + user);
    }
}
