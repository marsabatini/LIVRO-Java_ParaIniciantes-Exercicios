package Cap_08.Exemplo0005;

    // Demonstra as referências de interface

public class ByTwos implements Series{

    int start;
    int val;

    ByTwos(){
        start = 0;
        val = 0;
    }

    public int getNext(){
        val += 2;
        return val;
    }

    public void reset(){
        val = start;
    }

    public void setStart(int x){
        start = x;
        val = x;
    }
}
