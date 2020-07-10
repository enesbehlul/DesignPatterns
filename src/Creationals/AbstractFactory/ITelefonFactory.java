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
public interface ITelefonFactory {
    
    ITelefon getTelefon(String model, String batarya, int en, int boy);
    
}
