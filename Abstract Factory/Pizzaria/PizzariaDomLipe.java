public class PizzariaDomLipe implements PizzaFactory{

    @Override
    public PizzaStrategy sabor() {
        return new saborQueijo();
    }
}
