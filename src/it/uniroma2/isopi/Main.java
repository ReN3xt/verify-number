package it.uniroma2.isopi;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){

        Logger logger = Logger.getLogger(Main.class.getName());

        if(args.length == 1 && Main.isInteger(args[0])){
            if(isMultipleOfTwo(Integer.parseInt(args[0]))){
                logger.log(Level.INFO, "{0} è multiplo di 2", args[0]);
            } else {
                logger.log(Level.INFO, "{0} non è multiplo di 2", args[0]);
            }
        } else {
            logger.log(Level.INFO, "Inserisci un numero come parametro");
        }
    }

    public static boolean isMultipleOfTwo(int i){
        return i % 2 == 0;
    }

    public static boolean isInteger(String arg){
        try {
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
