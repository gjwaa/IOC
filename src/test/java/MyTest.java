import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DeptServiceImpl;

public class MyTest {

    @Test
    public void testIoc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DeptServiceImpl deptService = context.getBean("deptService", DeptServiceImpl.class);
        deptService.getUser();
    }


}
