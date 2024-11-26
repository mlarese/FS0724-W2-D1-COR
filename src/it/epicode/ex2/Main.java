package it.epicode.ex2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserire i Km percorsi");
            int km = scanner.nextInt();
            System.out.println("Inserire i litri di carburante consumati");
            int litri = scanner.nextInt();

            double kmLitro = km / litri;
        } catch(ArithmeticException e){
           LOGGER.error("I litri devono essere maggiori di 0");
        } catch (Exception e) {
           LOGGER.error("Inserire dei numeri");
        }
    }
}
