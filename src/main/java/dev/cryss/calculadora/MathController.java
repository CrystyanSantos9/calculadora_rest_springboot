package dev.cryss.calculadora;

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

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        Double subtraction = NumberConverter.convertToDouble (numberOne) - NumberConverter.convertToDouble (numberTwo);
        return subtraction;
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        Double multiplication = NumberConverter.convertToDouble (numberOne) * NumberConverter.convertToDouble (numberTwo);
        return multiplication;
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        Double division = NumberConverter.convertToDouble (numberOne) / NumberConverter.convertToDouble (numberTwo);
        return division;
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        Double mean = (NumberConverter.convertToDouble (numberOne) + NumberConverter.convertToDouble (numberTwo)) / 2;
        return mean;
    }

    @RequestMapping(value = "/squareRoot/{numberOne}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable("numberOne") String numberOne) throws Exception {

        if (!NumberConverter.isNumeric (numberOne)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        Double squareRoot = Math.sqrt (NumberConverter.convertToDouble (numberOne));
        return squareRoot;
    }


}
