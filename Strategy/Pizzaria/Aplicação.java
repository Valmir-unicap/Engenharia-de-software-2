public class Main {
    public static void main(String[] args) {
        System.out.println("Desgin Patterns - Strategy");
        System.out.println("");
        PizzaStrategy pizzaSabor1 = new saborQueijo();
        System.out.println(pizzaSabor1);
        System.out.println("");
        PizzaStrategy pizzaSabor2 = new saborCalabresa();
        System.out.println(pizzaSabor2);
        System.out.println("");
        PizzaStrategy pizzaSabor3 = new saborFrango();
        System.out.println(pizzaSabor3);
    }
}
