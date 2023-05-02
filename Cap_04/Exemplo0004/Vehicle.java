package Cap_04.Exemplo0004;

public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return mpg * fuelcap;
    }
}
