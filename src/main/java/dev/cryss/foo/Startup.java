package dev.cryss.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication
public class Startup {

    public static void main(String[] args) {
        SpringApplication.run (Startup.class, args);
    }

}
