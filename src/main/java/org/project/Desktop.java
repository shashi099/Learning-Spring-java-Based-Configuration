package org.project;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop Object Created");
    }

    public void compile(){
        System.out.println("compiling... using Desktop");
    }
}
