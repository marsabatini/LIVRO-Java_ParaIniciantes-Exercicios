package Cap_08.Exemplo0009;

public class MyIFImp2 implements MyIF{

    // Nesse caso, implementacões tanto de getUserID()
    // quanto de getAdminID() são formadas.

    public int getUserID(){
        return 100;
    }

    public int getAdminID(){
        return 42;
    }
}
