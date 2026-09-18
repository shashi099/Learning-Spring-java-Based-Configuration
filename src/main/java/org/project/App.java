
package org.project;

import org.project.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();


//        Desktop dk = context.getBean(Desktop.class);
//        dk.compile();
//
//        Desktop dk1 = context.getBean(Desktop.class);
//        dk.compile();
    }
}

