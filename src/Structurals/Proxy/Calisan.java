/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structurals.Proxy;

/**
 *
 * @author behlul
 */
public class Calisan {
    private String kullaniciAdi, sifre;
    private boolean isYonetici;

    public Calisan(String kullaniciAdi, String sifre, boolean isYonetici) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.isYonetici = isYonetici;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public boolean isYonetici() {
        return isYonetici;
    }

    public void setIsYonetici(boolean isYonetici) {
        this.isYonetici = isYonetici;
    }
    
    
    
}
