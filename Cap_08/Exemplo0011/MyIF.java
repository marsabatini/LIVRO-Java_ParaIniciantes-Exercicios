package Cap_08.Exemplo0011;

    // Esse é apenas um exemplo de como um método static
    // pode ser chamado a partir de uma interface

public interface MyIF {

    // Esta é a declaracão "comum" de método de uma interface.
    // Ela NÃO define uma implementacão padrão.

    int getUserID();

    // Este é um método padrão.
    // Observe que ele fornece uma implementacão padrão.
    default int getAdminID(){
        return 1;
    }

    // Este é o método estático da interface
    static int getUniversalID(){
        return 0;
    }
}
