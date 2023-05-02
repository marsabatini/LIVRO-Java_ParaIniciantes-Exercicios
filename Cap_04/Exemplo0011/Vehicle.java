package Cap_04.Exemplo0011;

public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    //Construtor para Vehicle

    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // m�todo que retorna a autonomia
    int range(){
        return mpg * fuelcap;
    }

    // m�toco que calcula o combust�vel necess�rio para cobrir uma determinada dist�ncia
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}
