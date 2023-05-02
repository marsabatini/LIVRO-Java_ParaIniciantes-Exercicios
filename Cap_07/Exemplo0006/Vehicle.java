package Cap_07.Exemplo0006;

public class Vehicle {

    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Retorna a autonomia.
    int range(){
        return mpg * fuelcap;
    }

    // Calcula o combustível necessário para uma dada distância
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }

    // Método de acesso de variáveis de instância
    int getPassengers(){
        return passengers;
    }
    void setPassengers(int p){
        passengers = p;
    }
    int getFuelcap(){
        return fuelcap;
    }
    void setFuelcap(int f){
        fuelcap = f;
    }
    int getMpg(){
        return mpg;
    }
    void setMpg(int m){
        mpg = m;
    }
}
