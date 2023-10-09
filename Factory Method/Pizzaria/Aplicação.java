public class Main {
    public static void main(String[] args) {
        System.out.println("Desgin Patterns - Strategy e Factory");
        System.out.println("");
        PizzaFactory pizzaria1 = new PizzariaAtlantico();
        System.out.println(pizzaria1);
        System.out.println("");
        PizzaFactory pizzaria2 = new PizzariaDomLipe();
        System.out.println(pizzaria2);
    }
}
