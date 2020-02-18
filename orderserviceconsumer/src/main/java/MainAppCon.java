import com.hy.demo.Service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Auther: heyong
 * @Date: 2020/2/18 00:31
 * @Description:
 */
public class MainAppCon {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);

        orderService.initOrder("1");
        System.out.println("运行成功");
        System.in.read();
    }
}
