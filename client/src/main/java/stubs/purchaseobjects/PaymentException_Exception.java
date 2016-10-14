
package stubs.purchaseobjects;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "PaymentException", targetNamespace = "http://webservice.aa.isa.fr.unice.polytech/")
public class PaymentException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PaymentException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public PaymentException_Exception(String message, PaymentException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public PaymentException_Exception(String message, PaymentException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: stubs.purchaseobjects.PaymentException
     */
    public PaymentException getFaultInfo() {
        return faultInfo;
    }

}
