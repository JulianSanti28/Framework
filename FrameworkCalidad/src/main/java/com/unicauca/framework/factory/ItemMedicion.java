/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.framework.factory;

import com.unicauca.framework.model.Sensor;
import java.util.ArrayList;

/**
 *
 * @author 57322
 */
public class ItemMedicion {

    //Lista de sensores
    ArrayList<Sensor> LstSensores = new ArrayList<>();
    //Atributos
    private String peso = "";

    public void addSensor(Sensor s) {
        this.LstSensores.add(s);
    }

    public boolean esAprobado() {
        /**
         * Todos los sensores deberían estar en el valor ideal
         */
        for (Sensor s : this.LstSensores) {
            if (!s.getMedida().equals(s.getMedidaIdeal()[1])) {
                return false;
            }
        }
        return true;
    }

}
