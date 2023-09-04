public class saborQueijo implements PizzaStrategy{

    @Override
    public String saborPizza(String sabor){
        sabor = "Pizza de Mussarela";
        return sabor;
    }

    @Override
    public String ingredientesPizza(String ingredientes){
        ingredientes = "Molho de tomate, Queijo Mussarela, Azeitona, Tomate e Orégano";
        return ingredientes;
    }
}
