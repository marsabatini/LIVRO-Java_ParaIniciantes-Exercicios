package Cap_08.Exemplo0009;

public interface MyIF {


    // Essa é uma declaracão "comum" de método de uma interface
    // Ela NÃO define uma implementacão padrão.
    int getUserID();

    // Este é um método padrão. Observe que ele fornece
    // uma implementacão padrão
    default int getAdminID(){
        return 1;
    }
}
