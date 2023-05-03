package Cap_08.Exemplo0007;

    /*
        O autor demonstra como interfaces contendo constantes
        são extremamente úteis, apesar de serem declaradas
        implicitamente como public, static e final.

        NOTA: apesar disso, em nota, o autor destaca que essa
        forma de usar constantes compartilhadas em uma interfa
        ce é bastante controversa e, aqui, foi utilizada apenas
        para demonstração.
     */

public class IConstD implements IConst{

    public static void main(String args[]){

        int nums[] = new int[MAX];

        for(int i = MIN; i < 11; i++){
            if( i >= MAX)
                System.out.println(ERRORMSG);
            else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
