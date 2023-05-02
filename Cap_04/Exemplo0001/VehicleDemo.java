package Cap_04.Exemplo0001;

public class VehicleDemo {

    public static void main (String[] args) {

        Vehicle minivan = new Vehicle();

        int range;

        // atribui valores aos campos da minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Calcula a autonomia, presumindo um tanque cheio de gasolina
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);

    }
}
