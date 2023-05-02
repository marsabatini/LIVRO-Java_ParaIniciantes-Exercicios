package Cap_05;

    //Usa um string para controlar uma instrução switch
public class Exemplo0019 {

    public static void main(String args[]){

        String command = "cancel";

        switch(command){
            case "connect":
                System.out.println("Connecting");
                break;

            case "cancel":
                System.out.println("Canceling");
                break;

            case "disconnect":
                System.out.println("Disconnecting");
                break;

            default:
                System.out.printf("Command Error!");
                break;
        }
    }
}
