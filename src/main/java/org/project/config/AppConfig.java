package org.project.config;

import org.project.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    //@Bean(name = {"desktop", "desk", "beanName"}) // NAME OF THE BEAN WE CAN DECLARE MORE THAN ONE NAME OF THE BEAN
    @Bean  // Default name of the Bean is method name(desktop)
    @Scope("prototype")  // It will help to create the object whenever we call the context.getBean() Method
    public Desktop desktop() {
        return new Desktop();
    }

}
