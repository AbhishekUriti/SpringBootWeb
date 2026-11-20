package org.demo1;

import org.demo1.model.Alien;
import org.demo1.model.Laptop;
import org.demo1.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springdemo1Application {

    public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(Springdemo1Application.class, args);
        LaptopService service=context.getBean(LaptopService.class);
        Laptop lap=context.getBean(Laptop.class);
        service.addLaptop(lap);


//        Alien alien=context.getBean(Alien.class);
//        System.out.println(alien.getAge());
//        alien.code();
    }

}
