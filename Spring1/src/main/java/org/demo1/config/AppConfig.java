package org.demo1.config;


import org.demo1.Alien;
import org.demo1.Computer;
import org.demo1.Desktop;
import org.demo1.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.demo1")
public class AppConfig {


//    @Bean
//    public Alien alien(Computer comp){ //@Qualifier("laptop")
//        Alien obj=new Alien();
//        obj.setAge(25);
//        obj.setComp(comp);
//        return obj;
//    }
//
//
////    @Bean(name = {"com2","desktop1","Beast"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop1(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
