/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behaviorals.Mediator;

import java.math.BigDecimal;

/**
 *
 * @author behlul
 */
public class Test {
    
    public static void main(String[] args) {
        
        Kabzimal kabzimal = new Kabzimal();
        
        DomatesUreticisi ureticiBahadir = new DomatesUreticisi("bahadir", EnumUrun.DOMATES, BigDecimal.valueOf(4), kabzimal);
        DomatesUreticisi ureticiYusuf = new DomatesUreticisi("yusuf", EnumUrun.DOMATES, BigDecimal.valueOf(3), kabzimal);
        
        DomatesHalcisi halciAhmet = new DomatesHalcisi("ahmet", BigDecimal.valueOf(5), kabzimal);
        DomatesHalcisi halciMehmet = new DomatesHalcisi("mehmet", BigDecimal.valueOf(6), kabzimal);
        
        kabzimal.ureticiEkle(ureticiYusuf);
        kabzimal.ureticiEkle(ureticiBahadir);
        
        kabzimal.halciEkle(halciAhmet);
        kabzimal.halciEkle(halciMehmet);
        
        ureticiBahadir.urunSat();
        
        halciMehmet.urunAl();
    }
}
