package dev.cryss.foo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong ();

    @RequestMapping("/greeting")
                             //greeting?name=value
    public Greeting greeting(@RequestParam(name = "name", defaultValue = "World") String name){
        return new Greeting (counter.incrementAndGet (), String.format (template, name));
    }
}
