package Cap_11.Exemplo0003;

    // Usa construtor, uma variável de instância e um método com a enumeracão

public enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed;      // velocidade típica de cada meio de transporte

    // Construtor
    Transport (int s){
        speed = s;
    }

    // Adiciona um método
    int getSpeed(){
        return speed;
    }
}
