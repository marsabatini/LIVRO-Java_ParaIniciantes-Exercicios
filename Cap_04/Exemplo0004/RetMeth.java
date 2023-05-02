package Cap_04.Exemplo0004;

public class RetMeth {
    public static void main(String[] args){

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // atribui valores a campos da minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;


        // atribui valores a campos de sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // obtém autonomias
        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Maneira menos eficiente: com variável");
        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " Miles.");
        System.out.println("Sportcar can carry " + sportscar.passengers + " with range of " + range2 + " Miles.");

        System.out.println("\nManeira mais eficiente: direto com método.");
        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + minivan.range() + " Miles.");
        System.out.println("Sportcar can carry " + sportscar.passengers + " with range of " + sportscar.range() + " Miles.");


    }
}
