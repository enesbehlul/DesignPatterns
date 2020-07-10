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
public class TelefonBayi {
    
    public static void main(String[] args) {
        ITelefon s8 = TelefonFabrikasi.getTelefon("s8", "2400mah", 4, 7);
        
        ITelefon note8 = TelefonFabrikasi.getTelefon("note8", "300", 5, 8);
        
        System.out.println(s8);
        System.out.println(note8);
    }
}
