package Cap_04.Exemplo0003;


// Nesta classe, ser� demonstrado o uso do m�todo()

public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    // M�todo: exige a autonomia do ve�culo
    void range(){
        System.out.println("Range is " + fuelcap * mpg);
    }
}
