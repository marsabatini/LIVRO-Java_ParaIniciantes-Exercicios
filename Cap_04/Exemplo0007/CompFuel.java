package Cap_04.Exemplo0007;

public class CompFuel {

    public static void main (String[] args){

        Vehicle minivan = new Vehicle();
        Vehicle sportcar =  new Vehicle();

        double gallons;
        int dist = 252;

        // atribui valores a minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // atribui valores a sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " +
                dist + " miles minivan needs " +
                gallons + " gallons of fuel.");

        gallons = sportcar.fuelNeeded(dist);
        System.out.println("To go " +
                dist + " miles sportcar needs " +
                gallons + " gallons of fuel.");

    }
}
