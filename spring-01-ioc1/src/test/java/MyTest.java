import com.yan.dao.UserDaoMysqlImpl;
import com.yan.service.UserService;
import com.yan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        /**
//         * 通过 new 来获取对象
//         */
//        // 用户实际调用的是业务层，dao层他们不需要接触！
//        UserService userService = new UserServiceImpl();
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        /**
         * 获取ApplicationContext, 拿到Spring的容器
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 通过Spring容器来获取对象
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
