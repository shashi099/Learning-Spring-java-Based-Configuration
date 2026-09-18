package org.project.config;

import org.project.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //@Bean(name = {"desktop", "desk", "beanName"}) // NAME OF THE BEAN WE CAN DECLARE MORE THAN ONE NAME OF THE BEAN
    @Bean  // Default name of the Bean is method name(desktop)
    public Desktop desktop() {
        return new Desktop();
    }

}
