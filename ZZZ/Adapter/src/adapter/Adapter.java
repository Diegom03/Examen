package adapter;

public class Adapter {

    public static void main(String[] args) {
        Conectable l1 = new Lampara();
        encenderAparato(l1);

        Conectable o1 = new Ordenador();
        encenderAparato(o1);
        
        Conectable l2 = new AdaptadorLampara();
        encenderAparato(l2);
    }

    private static void encenderAparato(Conectable l1) {
        l1.encender();
        System.out.println(l1.estaEncendida());
    }
}
