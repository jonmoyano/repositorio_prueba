/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import ws.WSoperaciones;
import ws.WSoperaciones_Service;

/**
 *
 * @author Jon
 */
public class TestWS {

    public static void main(String[] args) {
        WSoperaciones_Service servicio = new WSoperaciones_Service();
        WSoperaciones cliente = servicio.getWSoperacionesPort();
        
        //Utilizar metodos
        //Login
        if(cliente.login("John", "John2020")){
            System.out.println("Credenciales Correctas");
        }else{
            System.out.println("Credenciales Incorrectas");
        }
        
        //Prosesar pago
        System.out.println(cliente.procesarPago(5000, 20000));
    }

}
