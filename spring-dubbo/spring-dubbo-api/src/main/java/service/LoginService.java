package service;

/**
 * 登录服务
 *
 * @author 刘师臣
 * @date 2022/12/3
 */
public interface LoginService {

    /**
     * 登录校验
     *
     * @param username 用户名
     * @param password 密码
     * @return 结果
     */
    String login(String username, String password);
}
