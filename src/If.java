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
        if (numero < 18) ;{
            System.out.println("Ainda é uma criança!");
        } else {
            if (numero >= 18) {
            System.out.println("Já é maior de idade!");}
        }
    }
}


