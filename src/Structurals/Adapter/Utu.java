/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structurals.Adapter;

/**
 *
 * @author behlul
 */
public class Utu implements IElektrikliEvAletleri {

    private int volt;
    
    public Utu(){
        volt = 220;
    }
    
    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Ütü çalışıyor.");
        return volt;
    }
    
}
