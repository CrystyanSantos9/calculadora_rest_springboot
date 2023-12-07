package dev.cryss.calculadora;

import dev.cryss.calculadora.service.MathOperation.MathService;
import dev.cryss.exception.UnsuportedMathOperationException;
import dev.cryss.requests.converters.NumberConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    private NumberConverter numberConverter;

    @Autowired
    private MathService mathService;

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }
        return mathService.sum (NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));

    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        return mathService.subtraction (NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }


        return mathService.multiplication (NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        return mathService.division (NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric (numberOne) || !NumberConverter.isNumeric (numberTwo)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        return mathService.mean (NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));
    }

    @RequestMapping(value = "/squareRoot/{numberOne}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable("numberOne") String numberOne) throws Exception {

        if (!NumberConverter.isNumeric (numberOne)) {
            throw new UnsuportedMathOperationException ("Please set a numeric value!");
        }

        return mathService.sqrt (NumberConverter.convertToDouble (numberOne));
    }


}
