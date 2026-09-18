package org.project;

public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop Object Created");
    }

    public void compile(){
        System.out.println("compiling... using Desktop");
    }
}
