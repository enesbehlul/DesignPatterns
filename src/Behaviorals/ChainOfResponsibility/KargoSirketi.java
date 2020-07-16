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
public abstract class KargoSirketi {
    
    private EnumSehir sehir;
    private KargoSirketi sonrakiKargoSirketi;

    public KargoSirketi(EnumSehir sehir) {
        this.sehir = sehir;
        
    }

    public EnumSehir getSehir() {
        return sehir;
    }

    public KargoSirketi getSonrakiKargoSirketi() {
        return sonrakiKargoSirketi;
    }

    public KargoSirketi setSonrakiKargoSirketi(KargoSirketi sonrakiKargoSirketi) {
        this.sonrakiKargoSirketi = sonrakiKargoSirketi;
        return this;
    }
    
    public void kargola(EnumSehir sehir) {
        gelenKargoBilgileriYazdir(sehir);
        
        if (getSehir().equals(sehir)) {
            kargoTeslimBilgileriYazdir();
        } else if (getSonrakiKargoSirketi() != null) {
            getSonrakiKargoSirketi().kargola(sehir);
        } else{
            hizmetAlanDisi();
        }
    }
    
    public void hizmetAlanDisi() {
        System.out.println("Hizmet alani disinda.");
    }

    public void kargoTeslimBilgileriYazdir() {
        System.out.println(getSehir() +  " şubesi teslim aldı.");
    }

    public void gelenKargoBilgileriYazdir(EnumSehir sehir) {
        System.out.println(sehir.getSehir() + " iline gidecek kargo " + getSehir().getSehir() + " subesine geldi.");
    }
     
}
