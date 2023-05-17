package Cap_12.Exemplo0011;

    // Genéricos e arrays

public class Gen<T> {

    T ob;

    T vals[];   // correto

    Gen(T o, T[] nums) {
        ob = o;

        // Esta instrućão não é válida
        // vals = new T[10};        --> Não pode criar um array de tipo T

        // Mas está instrućão está correta
        vals = nums;
    }
}
