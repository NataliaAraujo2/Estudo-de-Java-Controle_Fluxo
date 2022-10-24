public class If {
    private int numero;

    public If() {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void simples(int numero) {
        if (numero <= 18)
        {
            System.out.println("É menor de idade!");
        } else {
            System.out.println("É maior de idade!");
            }
    }


    public void elseIf(int numero) {
        if (numero <= 7) {
            System.out.println("Ainda é uma criança");
        } else if (numero > 7 && numero < 18) {
            System.out.println("É um adolescente!");
        } else if (numero > 18 && numero < 60) {
            System.out.println("É um adulto!");
        } else {
            System.out.println("Está na melhor idade!");
        }
    }
}


