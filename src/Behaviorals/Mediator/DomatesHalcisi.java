/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behaviorals.Mediator;

import java.math.BigDecimal;

/**
 *
 * @author behlul
 */
public class DomatesHalcisi extends Halci{
    
    public DomatesHalcisi(String adi, BigDecimal fiyat, IAraci araci) {
        super(adi, EnumUrun.DOMATES, fiyat, araci);
    }
    
}
