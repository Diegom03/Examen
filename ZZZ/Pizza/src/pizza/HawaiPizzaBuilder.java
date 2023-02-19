package pizza;

public class HawaiPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        super.pizza.setMasa("suave");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("dulce");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("chorizo+alcachofa");
    }
}