public class saborCalabresa implements PizzaStrategy{

    public String _sabor = "Pizza de Calabresa";
    public String _ingredientes = "Molho de tomate, Azeitona, Mussarela, Cebola, Cheddar e Orégano";

    @Override
    public String saborPizza(String sabor){
        return _sabor;
    }

    @Override
    public String ingredientesPizza(String ingredientes){
        return _ingredientes;
    }
}
