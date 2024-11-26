package it.epicode.ex4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        String nome = "Mauro";
        String cognome = "Larese";

        LOGGER.info("Ciao {} {}",nome, cognome);

    }
}
