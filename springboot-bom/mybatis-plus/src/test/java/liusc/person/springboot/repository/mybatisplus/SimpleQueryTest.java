package liusc.person.springboot.repository.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.toolkit.SimpleQuery;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

/**
 * SimpleQuery 工具类 测试
 *
 * @author LiuShiChen
 * @date 2022/10/19 10:41:53
 **/
public class SimpleQueryTest extends SpringbootApplicationTests {

    @Test
    public void testSelectList() {
        System.out.println(("----- SimpleQueryTest testSelectList method test ------"));
        List<Long> userIdList = SimpleQuery.list(Wrappers.lambdaQuery(), UserDO::getId);
        System.out.println(userIdList);
    }

    @Test
    public void testSelectListMore() {
        System.out.println(("----- SimpleQueryTest testSelectList 叠加后续操作 method test ------"));
        // 获取 名称
        System.out.println(("----- 获取 名称 ------"));
        List<String> list = SimpleQuery.list(new QueryWrapper<UserDO>().eq("id", 5).lambda(), UserDO::getName);
        // 以 name 分组
        System.out.println(("----- 以 name 分组 ------"));
        Map<String, UserDO> userMap = SimpleQuery.keyMap(new LambdaQueryWrapper<UserDO>(), UserDO::getName);
        for (Map.Entry<String, UserDO> userDOEntry : userMap.entrySet()) {
            String name = userDOEntry.getKey();
            UserDO userDO = userMap.get(name);
            System.out.println(name + "------" + userDO);
        }

        // 以 name 分组，统计个数
        System.out.println(("----- 以 name 分组，统计个数 ------"));
//        SimpleQuery.group(new LambdaQueryWrapper<UserDO>(), UserDO::getName, Collectors.mapping(UserDO::getId, Collectors.toList()));
        for (Map.Entry<String, UserDO> userDOEntry : userMap.entrySet()) {
            String name = userDOEntry.getKey();
            UserDO userDO = userMap.get(name);
            System.out.println(name + "------" + userDO);
        }
    }
}
