/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structurals.Adapter;

/**
 *
 * @author behlul
 */
public class TelefonElektrikliEvAletleriAdapter implements IElektrikliEvAletleri {
    
    private ITelefon telefon;
    
    public TelefonElektrikliEvAletleriAdapter(ITelefon telefon){
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
    
}
