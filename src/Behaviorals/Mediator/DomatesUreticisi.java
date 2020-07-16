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
public class DomatesUreticisi extends Uretici{
    
    public DomatesUreticisi(String ad, EnumUrun urun, BigDecimal fiyat, IAraci araci) {
        super(ad, EnumUrun.DOMATES, fiyat, araci);
    }
    
}
