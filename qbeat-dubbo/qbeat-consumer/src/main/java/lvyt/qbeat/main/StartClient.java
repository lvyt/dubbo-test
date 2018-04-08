package lvyt.qbeat.main;

import lvyt.qbeat.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author by lvyt
 *         on 2018/4/4.
 */
public class StartClient {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String result = demoService.test("zhangsan");

        System.out.printf("[msg = %s]",result);

    }

}
