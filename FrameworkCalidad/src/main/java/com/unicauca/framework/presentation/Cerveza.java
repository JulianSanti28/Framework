/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.framework.presentation;
import com.unicauca.framework.factory.FabricaItemMedicion;
import com.unicauca.framework.factory.ItemMedicion;

/**
 *
 * @author 57322
 */
public class Cerveza{
    private FabricaItemMedicion miFabrica = new FabricaCalidadCerveza();
    public ItemMedicion getItemMedicion(){
        return miFabrica.crearItemMedicion();
    }
}
