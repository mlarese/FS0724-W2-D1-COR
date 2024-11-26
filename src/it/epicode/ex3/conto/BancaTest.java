package it.epicode.ex3.conto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BancaTest {
    private  final static Logger LOGGER = LoggerFactory.getLogger(BancaTest.class);
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Andrea", 100.0);
        ContoOnLine contoOnLine = new ContoOnLine("Mauro", 100.0, 20);

        double prelievo = 70.0;
        System.out.println("primo prelievo dal conto " + prelievo);

        try {
            conto.preleva(prelievo);
        } catch (BancaException e) {
            LOGGER.error(e.getMessage());
        }



        prelievo = 50.0;
        System.out.println("secondo prelievo dal conto " + prelievo);

        try {
            conto.preleva(prelievo);
        } catch (BancaException e) {
            LOGGER.error(e.getMessage());
        }
        
        prelievo = 10.0;

        System.out.println("primo prelievo dal conto Online " + prelievo);
        try {
            contoOnLine.preleva(prelievo);
        } catch (BancaException e) {
            LOGGER.error(e.getMessage());
        }

        prelievo = 10.0;

        System.out.println("secondo prelievo dal conto Online " + prelievo);
        try {
            contoOnLine.preleva(prelievo);
        } catch (BancaException e) {
            LOGGER.error(e.getMessage());
        }

        prelievo = 10.0;

        System.out.println("terzo prelievo dal conto Online " + prelievo);
        try {
            contoOnLine.preleva(prelievo);
        } catch (BancaException e) {
            LOGGER.error(e.getMessage());
        }


        prelievo = 40.0;

        System.out.println("quarto prelievo dal conto Online " + prelievo);
        try {
            contoOnLine.preleva(prelievo);
        } catch (BancaException e) {
            LOGGER.error(e.getMessage());
        }

    }
}
