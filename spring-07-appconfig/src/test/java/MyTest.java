import com.yan.config.YanConfig;
import com.yan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        // 如果完全使用配置类方式去做，我们就只能通过 AnnotationConfigApplicationContext 上下文来获取容器，通过配置类来获取对象
        ApplicationContext context = new AnnotationConfigApplicationContext(YanConfig.class);
        User user = context.getBean("getUser", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user == user1);
        System.out.println(user.getName());
    }
}
