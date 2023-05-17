package Cap_12.Exemplo0010;

    // Demonstra um tipo bruto.

public class Gen<T> {

    T ob;       // declara um obj de tipo T

    // Passa para o construtor uma referência
    // a um objeto do tipo T
    Gen(T o){
        ob = o;
    }

    // Retorna ob
    T getOb(){
        return ob;
    }
}
