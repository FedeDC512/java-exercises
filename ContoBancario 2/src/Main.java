public class Main {
    public static void main (String[] args) {
        ContoBancario c1 = new ContoBancario();
        System.out.println(c1);
        ContoBancario c2 = new ContoBancario();
        System.out.println(c2);

        c1.versa(100);
        System.out.println("Il saldo del conto di "+ c1.getNomeCompleto() +" è " + c1.getSaldo() + "€");
        c1.preleva(30);
        System.out.println("Il saldo del conto di "+ c1.getNomeCompleto() +" è " + c1.getSaldo() + "€");

        c1.trasferisci(c2, 20);
        System.out.println("Il saldo del conto di "+ c1.getNomeCompleto() +" è " + c1.getSaldo() + "€");
        System.out.println("Il saldo del conto di "+ c2.getNomeCompleto() +" è " + c2.getSaldo() + "€");

    }
}
