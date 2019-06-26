/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Mediana")
public class Mediana {



    /**
     * Web service operation
     * @param nro1
     * @param nro2
     * @return 
     */
    @WebMethod(operationName = "Mediana")
    public float Mediana(@WebParam(name = "nro1") float nro1, @WebParam(name = "nro2") float nro2 ) {
        //TODO write your implementation code here:
        return nro1+nro2/2;
    }
}
