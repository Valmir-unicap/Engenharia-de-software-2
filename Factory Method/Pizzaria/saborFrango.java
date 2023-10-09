public class saborFrango implements PizzaStrategy{

    public String _sabor = "Pizza de Frango";
    public String _ingredientes = "Molho de tomate, Mussarela, Frango desfiado, Azeitona, Tomate e Orégano";

    @Override
    public String saborPizza(String sabor){
        return _sabor;
    }

    @Override
    public String ingredientesPizza(String ingredientes){
        return _ingredientes;
    }
}
