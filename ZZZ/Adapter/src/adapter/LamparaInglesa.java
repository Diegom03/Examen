package adapter;

public class LamparaInglesa {

    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void on() {

        isOn = true;
    }

    public void off() {

        isOn = false;
    }
}
