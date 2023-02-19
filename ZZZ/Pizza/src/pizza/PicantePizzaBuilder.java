package pizza;

public class PicantePizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        super.pizza.setMasa("cocida");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("picante");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("pimienta+salchichon");
    }
}