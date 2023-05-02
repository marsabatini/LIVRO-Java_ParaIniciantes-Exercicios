package Cap_02;/*

    ESte programa demonstra o laćo for

 */


public class Exemplo0006 {
    public static void main (String args[]){

        int count;

        System.out.println("Laćo com count + 1:");
        for (count = 0; count < 5; count = count+1) // este laćo itera 5 vezes
            System.out.println("This is count: " + count);

        System.out.println("Done whit count+1" + "\n");

        System.out.println("Laćo com operador de incremento (++):");
        for(count = 0; count < 5; count++) // este laćo tbem itera 5 vezes mas com o operador ++
            System.out.println("This is count++: " + count);

        System.out.println("Done whit count++\n");

    }
}
