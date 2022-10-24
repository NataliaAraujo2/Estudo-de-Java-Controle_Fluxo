public class Main {
    public static void main(String[] args) {
        int numero = 6;
        If i = new If();
        i.simples(numero);
        System.out.println("-----");
        i.elseIf(numero);
        System.out.println("************");
        While w = new While();
        w.simplesWhile(numero);
        System.out.println("-----");
        w.doWhile(numero);
        System.out.println("************");
        For f = new For();
        f.simplesFor(numero);
    }
}