public class Main {
    public static void main(String[] args) {
        int numero = 6;
        If i = new If();
        i.simples(numero);
        i.elseIf(numero);

        While w = new While();
        w.simplesWhile(numero);
        w.doWhile(numero);

    }

}