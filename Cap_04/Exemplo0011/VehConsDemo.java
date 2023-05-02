package Cap_04.Exemplo0011;

public class VehConsDemo {

    public static void main (String[] args){

        double gallons;
        int dist = 252;

        //Constrói veículos completos
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportcar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel.");
    }
}
