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
public class SamsungTelefon implements ITelefon {

    private int calismaVoltaji;

    public SamsungTelefon() {
        calismaVoltaji = 5;
    }
    
    
    
    @Override
    public int sarjEt() {
        System.out.println("Samsung telefon sarj oluyor...");
        return calismaVoltaji;
    }
    
}
