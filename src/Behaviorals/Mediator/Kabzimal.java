/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behaviorals.Mediator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author behlul
 */
public class Kabzimal implements IAraci{

    private List<Uretici> ureticiler;
    private List<Halci> halciler;

    public Kabzimal() {
        this.ureticiler = new ArrayList();
        this.halciler = new ArrayList();
    }
    
    @Override
    public void ureticiEkle(Uretici uretici) {
        ureticiler.add(uretici);
    }

    @Override
    public void halciEkle(Halci halci) {
        halciler.add(halci);
    }

    @Override
    public void ureticidenAl(Uretici uretici) {
        Halci enUygunHalci = enUygunHalciyiBul(uretici.getUrun());
        satisYap(uretici, enUygunHalci);
    }

    @Override
    public void haleSat(Halci halci) {
        Uretici enUygunUretici = enUygunUreticiyiBul(halci.getUrun());
        satisYap(enUygunUretici, halci);
    }

    private void satisYap(Uretici uretici, Halci halci) {
        System.out.println(uretici.getAd() + " adli uretici " + halci.getAdi()
        + " adli halciye " + uretici.getUrun().getUrun() + " satisini gerceklestirdi.");
    }

    private Uretici enUygunUreticiyiBul(EnumUrun urun) {
        Uretici enUygunUretici = null;
        
        for (Uretici uretici : ureticiler) {
            if (urun.equals(uretici.getUrun())) {
                BigDecimal ureticiFiyati = uretici.getFiyat();
                
                if (enUygunUretici == null || enUygunUretici.getFiyat().compareTo(ureticiFiyati) > 0) {
                    enUygunUretici = uretici;
                }
            }
        }
        
        return enUygunUretici;
    }
    
    private Halci enUygunHalciyiBul(EnumUrun urun) {
        Halci enUygunHalci = null;
        
        for (Halci halci : halciler) {
            if (urun.equals(halci.getUrun())) {
                BigDecimal ureticiFiyati = halci.getFiyat();
                
                if (enUygunHalci == null || enUygunHalci.getFiyat().compareTo(ureticiFiyati) < 0) {
                    enUygunHalci = halci;
                }
            }
        }
        
        return enUygunHalci;
    }
}
