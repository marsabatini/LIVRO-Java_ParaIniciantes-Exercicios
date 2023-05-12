package Cap_10.Exemplo0010;

    // Usa wait() e notify() para simular um relógio funcionando

public class TickTock {

    String state;       // contém o estado do relógio

    synchronized void thick(boolean running){
        if(!running){
            state = "ticked";
            notify();       // notifica qualquer thread que estiver esperando
            return;
        }

        System.out.print("Tick");

        state = "ticked";   // define o estado atual com ticked
        notify();           // permite que tock() seja executado

        try{
            while(!state.equals("tocked"))
                wait();     // espera tock() terminar
        } catch(InterruptedException exception){
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();       // notifica qualquer thread que estiver esperando
            return;
        }

        System.out.println("Tock");

        state = "tocked";   // define o estado atual para tocked
        notify();

        try{
            while(!state.equals("ticked"))
                wait();
        } catch(InterruptedException exception){
            System.out.println("Thread interrupted");
        }
    }
}
