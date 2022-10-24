import java.util.ArrayList;

public class While {
    private int numero;

    public While() {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void simplesWhile(int numero){
        int i = 0;
        while (i<numero){
            System.out.println(i);
            i++;
        }
    }

    public void doWhile(int numero) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while ( i < numero) ;{}
    }
}
