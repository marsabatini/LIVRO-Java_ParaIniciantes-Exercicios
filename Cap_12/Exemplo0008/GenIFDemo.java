package Cap_12.Exemplo0008;

public class GenIFDemo {

    public static void main(String args[]){

        Integer x[] = { 1, 2, 3 };

        MyClass<Integer> ob = new MyClass<Integer>(x);

        if(ob.contains(2))
            System.out.println("2 is in ob.");
        else
            System.out.println("2 is NOT in ob.");

        if(ob.contains(5))
            System.out.println("5 is in ob.");
        else
            System.out.println("5 is NOT in ob.");

        // A parte abaixo não é válida porque ob é
        // um objeto Containment de tipo Integer
        // e 9.25 é um valor Double.
        //  if(ob.contains(9.25)
        //      System.out.println("9.25 is in ob.");
    }
}
