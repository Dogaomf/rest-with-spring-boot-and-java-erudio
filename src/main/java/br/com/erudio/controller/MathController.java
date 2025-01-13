package br.com.erudio.controller;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

import static br.com.erudio.utils.NumberUtils.convertToDouble;
import static br.com.erudio.utils.NumberUtils.isNumeric;

@RestController
public class MathController {
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private MathService mathService ;

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return mathService.sum(convertToDouble(numberOne),convertToDouble(numberTwo));
    }

    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  mathService.sub(convertToDouble(numberOne),convertToDouble(numberTwo));
    }

    @RequestMapping(value="/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  mathService.mult(convertToDouble(numberOne),convertToDouble(numberTwo));
    }

    @RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return mathService.div(convertToDouble(numberOne),convertToDouble(numberTwo));
    }

    @RequestMapping(value="/media/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double media(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return mathService.media(convertToDouble(numberOne),convertToDouble(numberTwo));
    }

    @RequestMapping(value="/raiz/{numberOne}", method=RequestMethod.GET)
    public Double raiz(
            @PathVariable(value = "numberOne") String numberOne) throws Exception {
        if(!isNumeric(numberOne) ) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return  mathService.raiz(convertToDouble(numberOne));
    }
}
