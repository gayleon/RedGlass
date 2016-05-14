
package rg;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Reloj implements Runnable{
    int cuenta, valor;
    
    public Reloj(int v) {
        cuenta = 0;
    }
    
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                cuenta++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
