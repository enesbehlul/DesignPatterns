/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creationals.AbstractFactory;

/**
 *
 * @author behlul
 */
public class TelefonBayisi {
    
    public static void main(String[] args) {
        S8Fabrikasi s8Fabrikasi = new S8Fabrikasi();
        ITelefon s8 = s8Fabrikasi.getTelefon("s8", "2400mah", 4, 7);
        
        Note8Fabrikasi note8Fabrikasi = new Note8Fabrikasi();
        ITelefon note8 = note8Fabrikasi.getTelefon("note8", "3000mah", 5, 8);
        
        System.out.println(s8);
        System.out.println(note8);
    }
    
}
