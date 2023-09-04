public class saborCalabresa implements PizzaStrategy{

    @Override
    public String saborPizza(String sabor){
        sabor = "Pizza de Calabresa";
        return sabor;
    }
    @Override
    public String ingredientesPizza(String ingredientes){
        ingredientes = "Molho de tomate, Azeitona, Mussarela, Cebola, Cheddar e Orégano";
        return ingredientes;
    }
}
