package Cap_08.Exemplo0005;

public class SeriesDemo2 {

    public static void main(String args[]){

        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for(int i = 0; i < 5; i++){
            ob = twoOb;
            // Acessa um objeto através de uma referência de interface
            System.out.println("Next ByTwo value is " + ob.getNext());

            ob = threeOb;
            // Acessa um objeto através de uma referência de interface
            System.out.println("Next ByThree value is " + ob.getNext());

            System.out.println();
        }
    }
}
