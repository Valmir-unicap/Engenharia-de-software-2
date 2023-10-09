public class saborCalabresa implements PizzaStrategy{

    String sabor = "Pizza de Calabresa";
    String ingredientes = "Molho de tomate, Azeitona, Mussarela, Cebola, Cheddar e Orégano";

    @Override
    public String saborPizza(String sabor){
        return sabor;
    }

    @Override
    public String ingredientesPizza(String ingredientes){
        return ingredientes;
    }
}
