package liusc.person.springboot.repository.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import liusc.person.springboot.repository.mybatisplus.domain.enums.GradeEnum;
import liusc.person.springboot.repository.mybatisplus.repository.entity.UserDO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * crud 测试类
 *
 * @author LiuShiChen
 * @date 2022/10/19 10:00:19
 **/
@SpringBootTest
public class CrudTest extends SpringbootApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserDO> userList = userMapper.selectList(null);
        Assert.isTrue(userList.size() > 0, "用户查询失败");
        userList.forEach(System.out::println);
    }

    @Test
    public void testSave() {
        System.out.println(("----- save method test ------"));
        boolean result = userService.save(new UserDO().setName("liusc").setAge(24).setGrade(GradeEnum.HIGH).setVersion(LocalDateTime.now()));
        Assert.isTrue(result, "用户新增失败");
    }

    @Test
    public void testSaveBatch() {
        System.out.println(("----- SaveBatch method test ------"));
        List<UserDO> userDOList = new ArrayList<>();
        userDOList.add(new UserDO().setName("liusc").setAge(24));
        userDOList.add(new UserDO().setName("dengww").setAge(24));
        userDOList.add(new UserDO().setName("jiangxw").setAge(23));
        // batchSize 表示将集合数据分几次插入
        boolean result = userService.saveBatch(userDOList, 3);
        Assert.isTrue(result, "用户批量新增失败");
    }

    @Test
    public void testSaveOrUpdate() {
        System.out.println(("----- SaveOrUpdate method test ------"));
        // 有哪些字段更新那些字段
        boolean result = userService.saveOrUpdate(new UserDO().setName("PDSP").setAge(24).setId(1582546123164270608L));
        Assert.isTrue(result, "用户更新失败");
    }

    @Test
    public void testSaveOrUpdaterWrapper() {
        System.out.println(("----- SaveOrUpdaterWrapper method test ------"));
        QueryWrapper<UserDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 5L);
        boolean result = userService.saveOrUpdate(new UserDO().setName("PP2").setAge(24), queryWrapper);
        Assert.isTrue(result, "用户更新失败");
    }

    @Test
    public void testRemoveById() {
        System.out.println(("----- RemoveById method test ------"));
        boolean result = userService.removeById(6L);
        Assert.isTrue(result, "用户删除失败");
    }

    @Test
    public void testRemoveByMap() {
        System.out.println(("----- removeByMap method test ------"));
        Map<String, Object> conditionMap = new HashMap<>();
        conditionMap.put("name", "jiangxw");
        boolean result = userService.removeByMap(conditionMap);
        Assert.isTrue(result, "用户删除失败");
    }

    /**
     * 将所有 id 查询出来
     */
    @Test
    public void testListObjs() {
        System.out.println(("----- listObjs method test ------"));
        List<Object> objectList = userService.listObjs();
        System.out.println(objectList);
    }

    @Test
    public void testPage() {
        System.out.println(("----- page method test ------"));
        IPage<UserDO> page = new Page<>();
        IPage<UserDO> userDOPage = userService.page(page);
        System.out.println(userDOPage);
    }
}
