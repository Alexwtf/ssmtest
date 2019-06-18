import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lining on 2019/6/13.
 */
public class Start {
    public static void main(String[] args) throws IOException{
        //com.alibaba.dubbo.container.Main.main(args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        context.start();

        System.out.println("-----dubbo开启-----");

        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
