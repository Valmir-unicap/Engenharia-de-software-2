public class saborCalabresa implements PizzaStrategy{

    public String sabor = "Pizza de Calabresa";
    public String ingredientes = "Molho de tomate, Azeitona, Mussarela, Cebola, Cheddar e Orégano";

    @Override
    public String saborPizza(String sabor){
        return sabor;
    }

    @Override
    public String ingredientesPizza(String ingredientes){
        return ingredientes;
    }
}
