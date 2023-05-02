package Cap_04.Exemplo0003;


// Nesta classe, será demonstrado o uso do método()

public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    // Método: exige a autonomia do veículo
    void range(){
        System.out.println("Range is " + fuelcap * mpg);
    }
}
