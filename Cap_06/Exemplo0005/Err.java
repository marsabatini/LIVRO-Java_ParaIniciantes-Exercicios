package Cap_06.Exemplo0005;

    // Retorna um objeto definido pelo programador
public class Err {

    String msg;         // mensagem de erro
    int severity;       // indica a gravidade do erro

    Err(String m, int s){
        msg = m;
        severity = s;
    }
}
