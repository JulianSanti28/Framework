/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.framework.presentation;

import com.unicauca.framework.factory.ItemMedicion;
import com.unicauca.framework.model.Sensor;

/**
 *
 * @author 57322
 */
public class ClienteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Clase concreta
         */
        Cerveza C = new Cerveza();
        ItemMedicion IMedicion = C.getItemMedicion(); //Obtener Medicion para la clase concreta
        Sensor S = new SensorPesoCerveza();
        S.setMedida(S.obtenerLectura("2.4"));
        S.setMedidaIdeal("0", "2.5");
        IMedicion.addSensor(S);
        if (IMedicion.esAprobado()) {
            System.out.println("Producto APROBADO");
        }
    }

}
