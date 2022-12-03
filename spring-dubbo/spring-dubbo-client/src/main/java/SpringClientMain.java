import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.LoginService;

/**
 * @author 刘师臣
 * @date 2022/12/3
 */
public class SpringClientMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/application.xml");

        LoginService loginService = context.getBean(LoginService.class);
        String result = loginService.login("admin", "123456");
        System.out.println(result);
    }
}
