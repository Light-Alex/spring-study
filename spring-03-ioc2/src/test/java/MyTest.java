import com.yan.pojo.User;
import com.yan.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 在配置文件加载的时候，容器中管理的对象就已经初始化了
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user = (UserT) context.getBean("u5");
        user.show();
    }
}
