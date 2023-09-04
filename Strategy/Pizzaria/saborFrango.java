public class saborFrango implements PizzaStrategy{

    @Override
    public String saborPizza(String sabor){
        sabor = "Pizza de Frango";
        return sabor;
    }

    @Override
    public String ingredientesPizza(String ingredientes){
        ingredientes = "Molho de tomate, Mussarela, Frango desfiado, Azeitona, Tomate e Orégano";
        return ingredientes;
    }
}
