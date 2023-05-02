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

    // método que retorna a autonomia
    int range(){
        return mpg * fuelcap;
    }

    // métoco que calcula o combustível necessário para cobrir uma determinada distância
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}
