package dev.cryss.foo;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    @RequestMapping(value="/sum/numberOne/numberTwo", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo){
        return 1D;
    }
}
