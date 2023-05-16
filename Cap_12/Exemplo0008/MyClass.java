package Cap_12.Exemplo0008;

    // Implementa Containment usando um array.

import Cap_12.Exemplo0008.Containment;

// Toda classe que implementa uma interface
// genérica também deve ser genérica.
public class MyClass <T> implements Containment<T> {

    T[] arrayRef;

    MyClass(T[] o){
        arrayRef = o;
    }

    // Implementa contains()
    public boolean contains(T o){
        for(T x : arrayRef)
            if(x.equals(o))
                return true;
        return false;
    }
}
