import com.yan.mapper.UserMapper;
import com.yan.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void test() throws IOException {
        String resources = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sessionFactory.openSession(true);


        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUsers();
        for(User user : userList){
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        for(User user : userMapper.selectUsers()){
            System.out.println(user);
        }
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);

        for(User user : userMapper.selectUsers()){
            System.out.println(user);
        }
    }
}
