package pizza;

public class Main {
    
    public static void main(String[] args) {
        Cocina cocina = Cocina.getInstance();

        PizzaBuilder hawaianPizza = PizzaFactory.getInstance(PizzaFactory.HAWAII_PIZZA);
        PizzaBuilder picantePizza = PizzaFactory.getInstance(PizzaFactory.PICANTE_PIZZA);
        
        cocina.setPizzaBuilder(hawaianPizza);
        cocina.construirPizza();
        
        cocina.setPizzaBuilder(picantePizza);
        cocina.construirPizza();  
    }
}
