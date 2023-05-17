package Cap_11.Exemplo0012;

    // Semáforo computadorizado

public class TrafficLightSimulator implements Runnable {

    private Thread thrd;            // contém a thread que executa a simulação
    private TrafficLightColor tlc;  // contém a cor do sinal
    boolean stop = false;           // configura com true para interromper a simulação
    boolean changed = false;        // true quando o sinal mudou

    TrafficLightSimulator(TrafficLightColor init){
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator(){

        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();;

    }

    // Inicia o semáforo
    public void run(){

        while(!stop){
            // Observe como esse código foi simplificado
            try{
                Thread.sleep(tlc.getDelay());
            } catch(InterruptedException exc){
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Muda a cor
    synchronized void changeColor(){
        switch(tlc){
            case RED:
                tlc =  TrafficLightColor.GREEN;
                break;

            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;

            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }

        changed = true;
        notify();           // sinaliza que a cor mudou
    }

    // Espera até uma mudança de sinal ocorrer
    synchronized void waitForChange(){
        try{
            while(!changed)
                wait();     // espera o sinal mudar
            changed = false;
        } catch(InterruptedException exc){
            System.out.println(exc);
        }
    }

    // Retorna a cor atual
    synchronized TrafficLightColor getColor(){
        return tlc;
    }

    // Interrompe o semáforo
    synchronized void cancel(){
        stop = true;
    }
}
