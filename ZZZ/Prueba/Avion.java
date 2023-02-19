import java.util.ArrayList;

public abstract class Avion extends Thread implements IAvion{
    private String nombre;
    private ArrayList<IAvion> aviones = new ArrayList<IAvion>();

    public Avion(String nombre) {
        this.nombre = nombre;
        System.out.println("Avion Lider [" + this.nombre + "] creado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAvion(IAvion avion) {
        aviones.add(avion);
    }

    @Override
    public void girarDerecha() {
        System.out.println("Avion Lider [" + this.getNombre() + "] girando a la derecha");
        for (IAvion avion : aviones) {
            avion.girarDerecha();
        }
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Avion Lider [" + this.getNombre() + "] girando a la izquierda");
        for (IAvion avion : aviones) {
            avion.girarIzquierda();
        }
    }  
}