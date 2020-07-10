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
public class Note8Fabrikasi implements ITelefonFactory {

    @Override
    public ITelefon getTelefon(String model, String batarya, int en, int boy) {
        return new Note8(model, batarya, en, boy);
    }
    
}
