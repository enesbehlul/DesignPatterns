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
public class TelefonFabrikasi {
    
    public static ITelefon getTelefon(String model, String batarya, int en, int boy){
        ITelefon telefon;
        if ("s8".equalsIgnoreCase(model)) {
            telefon = new S8(model, batarya, en, boy);
        } else if ("note8".equalsIgnoreCase(model)) {
            telefon = new Note8(model, batarya, en, boy);
        } else {
            throw new RuntimeException("Gecerli bir model degil.");
        }
        return telefon;
    }
}
