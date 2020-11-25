package cl.desafiolatam.passwordstrength.model;

import java.net.PasswordAuthentication;

public class Verifier{

    public static final int weak = -1;
    public static final int medium = -2;
    public static final int strong = -3;
    public static final int min_lenght = 5;


    public int evaluatePass(String password) {
        if (!evaluateLenght(password))
                return weak;
             if (!evaluateUpper(password))
                   return medium;
             return  strong;
    }

    private boolean evaluateUpper(String password) {
        return password.toLowerCase().equals(password);

    }

    private boolean evaluateLenght(String password) {
        return password.length()>min_lenght;
    }

}






