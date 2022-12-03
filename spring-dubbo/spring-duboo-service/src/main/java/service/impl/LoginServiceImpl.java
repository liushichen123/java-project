package service.impl;

import service.LoginService;

/**
 * 登录服务实现类
 *
 * @author 刘师臣
 * @date 2022/12/3
 */
public class LoginServiceImpl implements LoginService {

    public String login(String username, String password) {
        if ("admin".equals(username) && "123456".equals(password)) {
            return "success";
        }
        return "false";
    }
}
