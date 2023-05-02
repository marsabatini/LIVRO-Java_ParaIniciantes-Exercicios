package Cap_07.Exemplo0009;

public class DynDispDemo {

    public static void main(String[] args){

        Sup superOb = new Sup();
        Sup1 subOb1 = new Sup1();
        Sup2 subOb2 = new Sup2();

        Sup supRef;

        // Em cada caso, a vesão who()
        // é determinada no tempo de e-
        // xecução pelo tipo de objeto
        // referenciado.

        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
    }
}
