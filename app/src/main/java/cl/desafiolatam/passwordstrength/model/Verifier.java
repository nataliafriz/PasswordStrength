package cl.desafiolatam.passwordstrength.model;


public class Verifier {

    public static final int weak = -1;
    public static final int medium =-2;
    public static final int strong = -3;
    public static final int min_lenght = 4;


    public int evaluatePass(String pass) {
        if (!evaluateLenght(pass))
            return weak;
        if (!evaluateUpper(pass))
            return  medium;
        return strong;

    }

    private boolean evaluateUpper(String pass) {
        return !pass.toLowerCase().equals(pass);
    }

    private boolean evaluateLenght(String pass) {
        return pass.length()>min_lenght;
    }

}






