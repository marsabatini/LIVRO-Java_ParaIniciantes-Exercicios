package Cap_02;/*

    Inicializaćão de variável dinâmica

 */

public class Exemplo0015 {
    public static void main (String args[]){

        double radius = 4, height = 5;

        // Inicializa o volume dinamicamente
        // volume é inicializada dinamicamente no tempo de execućão
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);

    }
}
