package Cap_11.Exemplo0005;

/*
    Tente Isto 12-1

    Uma simulação de um semáforo que usa uma enumeração
    para descrever as cores das luzes.

*/

public class TrafficLightDemo {

    public static void main(String args[]){

        TrafficLightSimulator t1 =  new TrafficLightSimulator(TrafficLightColor.GREEN);

        for(int i = 0; i < 9; i++){
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}
