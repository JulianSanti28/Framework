/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.framework.model;

/**
 *
 * @author 57322
 */
public abstract class Sensor {

    protected String medida;
    protected String[] medidaIdeal = new String[2];

    public abstract String obtenerLectura(String lectura);

    /* A template method : */
    public final void setMedida(String lectura) {
        this.medida = lectura;
    }

    /* A template method : */
    public final void setMedidaIdeal(String limiteInferior, String limiteSuperior) {
        this.medidaIdeal[0] = limiteInferior;
        this.medidaIdeal[1] = limiteSuperior;
    }

    public String getMedida() {
        return medida;
    }

    public String[] getMedidaIdeal() {
        return medidaIdeal;
    }
    
    

}
