package lvyt.qbeat.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author by lvyt
 *         on 2018/4/4.
 */
public class StartServer {

    public static void main(String[] args){
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-server.xml");
        context.start();
        System.out.println("服务器注册成功====================");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
