package Cap_06.Exemplo0004;

    // Retorna um objeto String
public class ErrorMsg {

    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bound"
    };

    // Retorna a mensagem de erro
    String getErrorMsg(int i){
        if(i >= 0 & i < msgs.length)
            return  msgs[i];
        else
            return "Invalid Error Code";
    }
}
