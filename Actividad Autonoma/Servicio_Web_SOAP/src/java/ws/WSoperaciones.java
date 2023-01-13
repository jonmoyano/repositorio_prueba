/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jon
 */
@WebService(serviceName = "WSoperaciones")
public class WSoperaciones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        
        if(usuario.equals("John") && contrasena.equals("John2020")){
            return true;
        } else{
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "Total") int Total, @WebParam(name = "Pago") int Pago) {
        
        if(Pago>=Total){
            return Pago - Total;
        }else{
            return -1;
        }
    }
}
