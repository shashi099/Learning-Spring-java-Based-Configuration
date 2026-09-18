package org.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;
//    @Autowired    THIS IS CALLED FIELD LEVEL CONFIGURATION
//    @Qualifier("laptop")
    private Computer com;

    public Alien() {
        System.out.println("ALien object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
//    @Qualifier("desktop")  // is called setter level configuration
    public void setCom(Computer com) {
        this.com = com;
    }
    public void code(){
        com.compile();
    }
}
