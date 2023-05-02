package Cap_06;

// Usa uma classe interna.
public class Exemplo0010 {

    int nums[];

    Exemplo0010(int n[]){
        nums = n;
    }

    void analyze(){
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }

    // Essa é uma classe interna
    class Inner{

        int min(){
            int m = nums[0];

            for(int i = 1; i < nums.length; i++){
                if(nums[i] < m)
                    m = nums[i];
            }
            return m;
        }

        int max(){
            int m = nums[0];

            for(int i = 1; i < nums.length; i++){
                if(nums[i] > m)
                    m = nums[i];
            }
            return m;
        }

        int avg(){
            int a = 0;

            for(int i = 0; i < nums.length; i++)
                a += nums[i];

            return a / nums.length;
        }
    }
}

class NestedClassDemo{

    public static void main(String args[]){

        int x[] = { 3, 2, 1, 5, 6, 9, 7, 8};

        Exemplo0010 exemplo0010 = new Exemplo0010(x);

        exemplo0010.analyze();
    }
}
