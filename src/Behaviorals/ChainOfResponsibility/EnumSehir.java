/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behaviorals.ChainOfResponsibility;

/**
 *
 * @author behlul
 */
public enum EnumSehir {
    
    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Çankırı"),
    KARS("Kars");
    
    private String sehir;
    
    EnumSehir(String sehir){
        this.sehir = sehir;
    }

    public String getSehir() {
        return sehir;
    }

    @Override
    public String toString() {
        return sehir;
    }
    
    
    
}
