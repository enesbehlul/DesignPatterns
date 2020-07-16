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
public abstract class Uretici {
    
    private String ad;
    private EnumUrun urun;
    private BigDecimal fiyat;
    
    private IAraci araci;

    public Uretici(String ad, EnumUrun urun, BigDecimal fiyat, IAraci araci) {
        this.ad = ad;
        this.urun = urun;
        this.fiyat = fiyat;
        this.araci = araci;
    }
    
    public void urunSat(){
        araci.ureticidenAl(this);
    }

    public String getAd() {
        return ad;
    }

    public EnumUrun getUrun() {
        return urun;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }    
}
