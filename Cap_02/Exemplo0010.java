package Cap_02;/*

    Usa o teorema de Pitágoras para encontrar
    o comprimento da hipotenusa dados os com-
    primentos dos dois lados opostos.

    Para isso, utiliza-se a classe Math, jun-
    tamente com seu método sqrt().

    Note que isso se assemelha à classe Sys-
    tem.out com seu método println().

 */

public class Exemplo0010 {
    public static void main (String args[]){

        double x, y, z;

        x = 3;
        y = 4;

        // Observe que o sqrt é chamado.
        // Ele é precedido pelo nome da classe da qual é membro: Math
        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " + z);

    }
}
