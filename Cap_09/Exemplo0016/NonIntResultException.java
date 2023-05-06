package Cap_09.Exemplo0016;

    // Usa uma excecão personalizada
    // Cria uma extensão

public class NonIntResultException extends Exception{

    int n;
    int d;

    NonIntResultException(int i, int j){
        n = i;
        d = j;
    }

    public String toString(){
        return "Result of " + n + " / " + d +
                " is non-integer.";
    }
}
