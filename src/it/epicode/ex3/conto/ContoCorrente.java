package it.epicode.ex3.conto;

public class ContoCorrente {
    private String titolare;
    private int nMovimenti;
    private final int maxMovimenti = 50;
    private double saldo;

    // Costruttore
    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    // Metodo per prelevare dal conto
    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            saldo -= x; // Nessuna commissione
        } else {
            saldo -= (x + 0.50); // Commissione di 0.50 dopo maxMovimenti
        }

        if(saldo<0) {
            throw  new BancaException("Il conto è in rosso");
        }
        nMovimenti++;
    }

    // Metodo per restituire il saldo corrente
    public double restituisciSaldo() {
        return saldo;
    }

    // Getter per il titolare (opzionale)
    public String getTitolare() {
        return titolare;
    }

    // Getter per il numero di movimenti (opzionale)
    public int getNumeroMovimenti() {
        return nMovimenti;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public double getSaldo() {
        return saldo;
    }
}
