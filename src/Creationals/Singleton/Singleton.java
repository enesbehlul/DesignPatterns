/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creationals.Singleton;

/**
 *
 * @author behlul
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        System.out.println("Ben olustum");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
