package dev.cryss.foo;

import dev.cryss.exception.UnsuportedMathOperationException;
import dev.cryss.utils.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {


    private NumberConverter numberConverter;

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        Double sum = NumberConverter.convertToDouble (numberOne) + NumberConverter.convertToDouble (numberTwo);
        return sum;
    }


}
