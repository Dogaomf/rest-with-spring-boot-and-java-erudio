package br.com.erudio.service.impl;

import br.com.erudio.service.MathService;
import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public  Double sum(Double numberOne, Double numberTwo){
       return numberOne + numberTwo;
    }

    @Override
    public Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    @Override
    public Double mult(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    @Override
    public Double div(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    @Override
    public Double media(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo)/2;
    }

    @Override
    public Double raiz(Double numberOne) {
        return Math.sqrt(numberOne);
    }


}
