package Cap_11.Exemplo0012;

    // Versão melhorada da simulaćão de semáforo
    // que armazena o retardo do sinal em TrafficLightColor

public enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int delay;

    TrafficLightColor(int d){
        delay = d;
    }

    int getDelay(){
        return delay;
    }
}
