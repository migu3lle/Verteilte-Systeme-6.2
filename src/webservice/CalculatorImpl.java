package webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "webservice.ICalculator")
public class CalculatorImpl implements ICalculator {

    @Override
    public String hallo(String wer) {
        return "Hallo " + wer;
    }

    @Override
    public double add(double addend1, double addend2) {
        return addend1 + addend2;
    }

    @Override
    public double sub(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    @Override
    public double mult(double multiplier, double multiplicand) {
        return multiplier * multiplicand;
    }

    @Override
    public double div(double dividend, double divisor) {
        return dividend / divisor;
    }
}
