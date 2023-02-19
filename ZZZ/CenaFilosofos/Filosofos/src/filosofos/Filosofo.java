package filosofos;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Filosofo extends Thread {
    private Mesa mesa;
    private int comensal;
    private int indiceComensal;

    public Filosofo(Mesa mesa, int comensal) {
        this.mesa = mesa;
        this.comensal = comensal;
        this.indiceComensal = comensal - 1;
    }
    
    @Override
    public void run() {
        while (true) {   
            this.pensando();
            this.mesa.cogerTenedores(this.indiceComensal);
            this.comiendo();
            System.out.println("Filosofo " + comensal + " deja de comer, tenedores libres " + (this.mesa.tenedorIzquierda(this.indiceComensal) + 1) + " ," + (this.mesa.tenedorDerecha(this.indiceComensal) + 1));
            this.mesa.dejarTenedores(this.indiceComensal);
        }
    }

    public void pensando() {
        System.out.println("Filósofo " + comensal + " esta pensando.");
        
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException ex) { }
    }
    
    public void comiendo() {
        System.out.println("Filósofo " + comensal + " esta comiendo.");
        
        try {
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException ex) { }
    }

}
