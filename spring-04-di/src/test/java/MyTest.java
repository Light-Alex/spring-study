import com.yan.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /*
        Student{
            name='张三',
            address=北京,
            books=[《红楼梦》, 《西游记》, 《三国演义》, 《水浒传》],
            hobbys=[听歌, 敲代码, 看电影],
            card={
                身份证=1234546876515,
                银行卡=123245646313
            },
            games=[LOL, COC, BOB],
            info={
                学号=2120214567,
                性别=男性,
                password=123456,
                姓名=小明,
                username=root
            },
            wife='null'
        }
         */
    }
}
