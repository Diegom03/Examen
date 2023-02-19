public class AvionPerseguidor implements IAvion{
    private String nombre;

    public AvionPerseguidor(String nombre) {
        this.setNombre(nombre);
        System.out.println("Avion Perseguidor [" + nombre + "] creado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void girarDerecha() {
        System.out.println("Avion Perseguidor [" + this.getNombre() + "] girando a la derecha");
        
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Avion Perseguidor [" + this.getNombre() + "] girando a la izquierda");
    }
}
