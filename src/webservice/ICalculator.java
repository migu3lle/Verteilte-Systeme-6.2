package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/*
Tutorial: https://www.torsten-horn.de/techdocs/jee-jax-ws.htm
 */

@WebService
public interface ICalculator {

    @WebMethod
    public String hallo(String wer);
    @WebMethod
    public double add(@WebParam(name = "addend1") double addend1,
                      @WebParam(name = "addend2") double addend2);
    public double sub(@WebParam(name = "minuend") double minuend,
                      @WebParam(name = "subtrahend") double subtrahend);
    public double mult(@WebParam(name = "multiplier") double multiplier,
                       @WebParam(name = "multiplicand") double multiplicand);
    public double div(@WebParam(name = "dividend") double dividend,
                      @WebParam(name = "divisor") double divisor);
}
