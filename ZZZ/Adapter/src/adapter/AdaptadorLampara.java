package adapter;

public class AdaptadorLampara implements Conectable {

    private LamparaInglesa lampara = new LamparaInglesa();

    @Override
    public boolean estaEncendida() {
        return lampara.isOn();
    }

    @Override
    public void encender() {
        lampara.on();
    }

    @Override
    public void apagar() {
        lampara.off();
    }
}
