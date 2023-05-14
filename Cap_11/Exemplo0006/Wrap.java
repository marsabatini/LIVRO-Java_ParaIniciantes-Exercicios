package Cap_11.Exemplo0006;

    // Demonstra o boxing e o unboxing manuais com um encapsulador de tipo.

public class Wrap {
    public static void main(String args[]){

        Integer iOb = new Integer(100);     // encapsula manualmente o valor 100

        int i = iOb.intValue();             // extrai manualmente o valor de iOb;

        System.out.println(i + " " + iOb);  //exibe 100 100
    }
}
