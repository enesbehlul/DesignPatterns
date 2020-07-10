/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creationals.Factory;

/**
 *
 * @author behlul
 */
public class S8 implements ITelefon{
    
    private String model;
    private String batarya;
    private int en;
    private int boy;

    public S8(String model, String batarya, int en, int boy) {
        this.model = model;
        this.batarya = batarya;
        this.en = en;
        this.boy = boy;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBatarya() {
        return batarya;
    }

    @Override
    public int getEn() {
        return en;
    }

    @Override
    public int getBoy() {
        return boy; 
    }

    @Override
    public String toString() {
        return "S8{" + "model=" + model + ", batarya=" + batarya + ", en=" + en + ", boy=" + boy + '}';
    }
    
    
    
}
