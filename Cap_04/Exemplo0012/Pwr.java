package Cap_04.Exemplo0012;

public class Pwr {

    double b;
    int e;
    double val;

    Pwr (double b, int e){
        this.b = b;
        this.e = e;

        val = 1;
        if(e == 0)
            return;

        for( ; e > 0 ; e --)
            val = val * b;
    }

    double getPwr(){
        return this.val;
    }
}
