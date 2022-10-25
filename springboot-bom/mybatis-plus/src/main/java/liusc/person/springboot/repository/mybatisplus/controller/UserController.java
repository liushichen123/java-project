package liusc.person.springboot.repository.mybatisplus.controller;

import com.github.pagehelper.PageInfo;
import liusc.person.springboot.repository.mybatisplus.common.ResultVO;
import liusc.person.springboot.repository.mybatisplus.controller.command.UserQuery;
import liusc.person.springboot.repository.mybatisplus.controller.vo.UserVO;
import liusc.person.springboot.repository.mybatisplus.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户 - controller api
 *
 * @author LiuShiChen
 * @date 2022/10/17 17:32:33
 **/
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * {
     *     "sorts": [
     *         {
     *             "field": "name",
     *             "direction": 1
     *         },
     *         {
     *             "field": "id",
     *             "direction": 1
     *         }
     *     ]
     * }
     * @param userPageParam
     * @return
     */
    @PostMapping("/page")
    public PageInfo<UserVO> page(@RequestBody UserQuery userPageParam) {
        PageInfo<UserVO> page = userService.page(userPageParam);
        return page;
    }
}
