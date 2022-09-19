package Clienthospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Interaction {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Client client = context.getBean("client",ClientImpl1.class);
        client.foundNumberCab("Лор");

    }
}
