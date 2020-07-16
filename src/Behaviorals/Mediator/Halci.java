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
public abstract class Halci {
    private String adi;
    private EnumUrun urun;
    private BigDecimal fiyat;
    
    private IAraci araci;

    public Halci(String adi, EnumUrun urun, BigDecimal fiyat, IAraci araci) {
        this.adi = adi;
        this.urun = urun;
        this.fiyat = fiyat;
        this.araci = araci;
    }
    
    public void urunAl(){
        araci.haleSat(this);
    }

    public String getAdi() {
        return adi;
    }

    public EnumUrun getUrun() {
        return urun;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }
    
}
