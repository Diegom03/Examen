package pizza;

public class PizzaFactory {
    public final static int HAWAII_PIZZA = 1;
    public final static int PICANTE_PIZZA = 2;
    
    public static PizzaBuilder getInstance(int pizzaSelected){
        PizzaBuilder pizza = null;
        
        switch(pizzaSelected){
            case HAWAII_PIZZA:
                pizza = new HawaiPizzaBuilder();
                break;
            case PICANTE_PIZZA:
                pizza = new PicantePizzaBuilder();
                break;
        }
        
        return pizza;
    }
}
