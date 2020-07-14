/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structurals.Proxy;

import java.math.BigDecimal;

/**
 *
 * @author behlul
 */
public class GercekYonetici implements ISirketBilgileri{

    @Override
    public BigDecimal getCiro() {
        return BigDecimal.valueOf(10000);
    }
    
}
