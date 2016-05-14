package rg;

import java.util.ArrayList;
import java.util.Random;

public class Creador implements Runnable{
    public ArrayList <proceso> Procesos;
    Random aleatorio;
    Reloj reloj;
     
    public Creador (Reloj reloj) {
        aleatorio = new Random();
        reloj = reloj;
        Procesos.add(new proceso());
    }
    
    public void run() {
        while(true) {
            if (aleatorio.nextInt(10) < 7 && contarListos() < 20) {
                Procesos.add(new proceso());
                System.out.println("Se creo Proceso");
            }
        }
    }
    
    public int contarListos() {
        int suma = 0;
        for (int i = 0; i < Procesos.size(); i++) {
            if (Procesos.get(i).estado == "listo") {
                suma++;
            }
        }
        return suma;
    }
}
