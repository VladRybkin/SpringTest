package ua.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.training.model.User;



@Configuration
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user=applicationContext.getBean("user", User.class);
        user.getId();
        user.getName();
        user.getName();
        user.getName();
        user.getName();
        user.print();
        System.out.println(user);

    }



}
