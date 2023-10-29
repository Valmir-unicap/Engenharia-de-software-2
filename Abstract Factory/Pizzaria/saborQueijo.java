public class saborQueijo implements PizzaStrategy{

    public String _sabor = "Pizza de Mussarela";
    public String _ingredientes = "Molho de tomate, Queijo Mussarela, Azeitona, Tomate e Orégano";

    @Override
    public String saborPizza(String sabor){
        return _sabor;
    }

    @Override
    public String ingredientesPizza(String ingredientes){
        return _ingredientes;
    }
}
