package it.epicode.ex3.conto;
public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    // Costruttore
    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo); // Chiama il costruttore della superclasse
        this.maxPrelievo = maxP;
    }

    // Metodo per stampare il saldo e altre informazioni
    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() +
                " - Saldo: " + restituisciSaldo() +
                " - Num movimenti: " + getNumeroMovimenti() +
                " - Massimo movimenti: " + getMaxMovimenti() +
                " - Massimo prelievo possibile: " + maxPrelievo);
    }

    // Metodo per prelevare con controllo del limite massimo
    @Override
    public void preleva(double x) throws BancaException {
        if (x <= maxPrelievo) {
            super.preleva(x); // Richiama il metodo della superclasse
        } else {
            throw new BancaException("Il prelievo non è disponibile");
        }


    }


}
