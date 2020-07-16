/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behaviorals.Mediator;

/**
 *
 * @author behlul
 */
public enum EnumUrun {
    DOMATES("Domates"),
    SALATALIK("Salatalık")
    ;
    
    private String urun;
    
    EnumUrun(String urun){
        this.urun = urun;
    }

    public String getUrun() {
        return urun;
    }
    
    
    
}
