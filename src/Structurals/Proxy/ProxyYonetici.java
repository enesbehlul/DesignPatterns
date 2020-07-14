/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structurals.Proxy;

import java.math.BigDecimal;

/**
 *
 * @author behlul
 */
public class ProxyYonetici implements ISirketBilgileri {

    private GercekYonetici gercekYonetici;

    private String kullaniciAdi, sifre;

    public ProxyYonetici(String kullaniciAdi, String sifre) {
        this.gercekYonetici = new GercekYonetici();
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    private boolean isKullaniciYonetici() {
        boolean isKullaniciYonetici = false;

        boolean isKullaniciValid = CalisanUtil.isKullaniciValid(kullaniciAdi, sifre);

        if (isKullaniciValid) {
            Calisan calisan = CalisanUtil.getCalisan(kullaniciAdi);
            isKullaniciYonetici = calisan.isYonetici();
        }

        return isKullaniciYonetici;
    }

    @Override
    public BigDecimal getCiro() throws IllegalAccessException {
        boolean isKullaniciYonetici = isKullaniciYonetici();

        if (isKullaniciYonetici) {
            return gercekYonetici.getCiro();
        } else {
            throw new IllegalAccessException();
        }

    }

}
