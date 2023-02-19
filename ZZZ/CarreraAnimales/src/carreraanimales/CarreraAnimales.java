package carreraanimales;

public class CarreraAnimales {


    public static void main(String[] args) {
        // Crear los corredores
        Corredor corredor1 = new Corredor("Liebre");
        Corredor corredor2 = new Corredor("Tortuga");
        Corredor corredor3 = new Corredor("Alberto");
        Corredor corredor4 = new Corredor("Cucaracha");
        Corredor corredor5 = new Corredor("Caracol");
        
        //Crear la pista
        Pista pista = new Pista(100);
        
        //Añadir los corredores
        pista.setCorredores(corredor1, corredor2, corredor3, corredor4, corredor5);
        
        // Inicia la carrera(thread)
        pista.empezarCarrera();
    }
    
}
