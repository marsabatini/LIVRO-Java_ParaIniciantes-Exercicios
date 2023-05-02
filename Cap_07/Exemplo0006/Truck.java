package Cap_07.Exemplo0006;

public class Truck extends Vehicle{

    private int cargocap;

    // Este é um construtor para Truck
    Truck(int p, int f, int m, int c){
        // Inicializa membros do Vehicle
        // usando o construtor de Vehicle
        super(p, f, m);

        cargocap = c;
    }

    // Getters and Setters
    int getCargocap(){
        return cargocap;
    }

    void setCargocap(int c){
        cargocap = c;
    }
}
