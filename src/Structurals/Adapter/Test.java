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
public class Test {

    public static void main(String[] args) {
        Priz priz = new Priz();

        Utu utu = new Utu();
        Buzdolabi buzdolabi = new Buzdolabi();
        
        SamsungTelefon samsungTelefon = new SamsungTelefon();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabi);
        
        TelefonElektrikliEvAletleriAdapter adapter = new TelefonElektrikliEvAletleriAdapter(samsungTelefon);
        priz.elektrikVer(adapter);
    }
}
