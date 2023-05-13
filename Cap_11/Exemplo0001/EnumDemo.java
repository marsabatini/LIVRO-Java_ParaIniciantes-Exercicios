package Cap_11.Exemplo0001;

public class EnumDemo {

    public static void main(String args[]){

        // Declara uma refeência Transport
        Transport tp;

        tp = Transport.AIRPLANE;        // atribui a tp a constante AIRPLANE

        // Exibe um valor da enum
        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        // Compara dois valores da enum
        if(tp == Transport.TRAIN)
            System.out.println("tp contains TRAIN.\n");

        // Usa uma enum para controlar uma instrucão switch
        switch (tp){
            case CAR:
                System.out.println("a car carries people");
                break;

            case TRUCK:
                System.out.println("A truck carries freight.");
                break;

            case AIRPLANE:
                System.out.println("An airplane flies.");
                break;

            case TRAIN:
                System.out.println("A train runs on rails.");
                break;

            case BOAT:
                System.out.println("A boat sails on water.");
                break;
        }
    }
}
