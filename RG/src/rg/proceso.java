/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rg;

import java.util.Random;

/**
 *
 * @author marin
 */
public class proceso {
    Random r;
    public final String ID;
    public int tiempoT, quantum, tRestante;
    
    public proceso(){
        r = new Random();
        ID = Integer.toString(r.nextInt(10000));
        tiempoT = r.nextInt(100)+50;
        quantum = r.nextInt(10)+5;
        tRestante = quantum;
        System.out.println(ID+" "+tRestante+" "+quantum);        
    }    
}
