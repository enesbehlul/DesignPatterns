/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structurals.Proxy;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author behlul
 */
public class App {
    public static void main(String[] args) {
        
        ProxyYonetici proxyYonetici = new ProxyYonetici("yusuf", "12345");
        
        try {            
            BigDecimal ciro = proxyYonetici.getCiro();
             
            System.out.println("Sirket cirosu = " + ciro);
        } catch (IllegalAccessException ex) {
            System.out.println("Hassas bilgilere erisiminiz yoktur.");
        }
    }
}
