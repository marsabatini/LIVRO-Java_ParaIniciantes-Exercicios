package Cap_04.Exemplo0007;

public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    //retorna a autonomia
    int range(){
        return mpg * fuelcap;
    }

    // calcula o combust�vel necess�rio para certa dist�ncia
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}
