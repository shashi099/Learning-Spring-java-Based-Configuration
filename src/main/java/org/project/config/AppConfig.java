package org.project.config;

import org.project.Alien;
import org.project.Computer;
import org.project.Desktop;
import org.project.Laptop;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.project")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer com){  // @Qualifier("desktop") means it will call the desktop object
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);  // which object will be called desktop or laptop
//        return obj;
//    }
//
//    //@Bean(name = {"desktop", "desk", "beanName"}) // NAME OF THE BEAN WE CAN DECLARE MORE THAN ONE NAME OF THE BEAN
//    @Bean  // Default name of the Bean is method name(desktop)
//    @Scope("prototype")  // It will help to create the object whenever we call the context.getBean() Method
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary  // means Computer will call the object of laptop instead of desktop
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
