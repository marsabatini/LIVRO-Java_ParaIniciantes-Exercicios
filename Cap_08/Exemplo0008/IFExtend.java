package Cap_08.Exemplo0008;

    /*
        Essa classe demonstra que uma interface pode
        também estender outra interface.
        Para isso, é preciso implementar a própria
        interface que foi extendida.
     */

public class IFExtend {

    public static void main(String args[]){

        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
