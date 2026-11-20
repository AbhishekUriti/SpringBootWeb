package org.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
   private int age;
//   private Laptop laptop;
    @Autowired
    @Qualifier("laptop")
    private Computer comp;
    public Alien(){
        System.out.println("Object Created");
    }

//    @ConstructorProperties({"age","laptop"})
//    public Alien(int age, Computer comp) {
//        this.age = age;
//        this.laptop = ;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding");
        comp.compile();
    }
}
