public class Main {
    public static void main(String[] args) throws Exception {
        ContoBancario c1 = new ContoBancario ();
        ContoBancario c2 = new ContoBancario();
        c1.versa(100);
        c2.versa(20);
        c1.preleva(20);

        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());

        c1.trasferisci(c2, 50);

        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());
    }
}
