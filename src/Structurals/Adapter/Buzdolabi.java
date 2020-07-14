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
public class Buzdolabi implements IElektrikliEvAletleri {

    private int volt;
    
    Buzdolabi(){
        volt = 220;
    }
    
    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Buzdolabı çalışıyor...");
        return volt;
    }
    
}
