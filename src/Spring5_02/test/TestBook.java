package Spring5_02.test;


import Spring5_02.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestBook {

    @Test
    public void test1 (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_02.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();
    }
}
