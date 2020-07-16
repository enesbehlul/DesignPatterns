/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behaviorals.Mediator;

/**
 *
 * @author behlul
 */
public interface IAraci {
    
    void ureticiEkle(Uretici uretici);
    
    void halciEkle(Halci halci);
    
    void ureticidenAl(Uretici uretici);
    
    void haleSat(Halci halci);
}
