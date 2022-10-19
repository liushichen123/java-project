package liusc.person.springboot.repository.mybatisplus;

import liusc.person.springboot.repository.mybatisplus.repository.mapper.UserMapper;
import liusc.person.springboot.repository.mybatisplus.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class SpringbootApplicationTests {

    @Resource
    public UserMapper userMapper;

    @Resource
    public UserService userService;

    @Test
    public void contextLoads() {
    }

}
