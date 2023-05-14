package Cap_11.Exemplo0010;

    // Encontra as solucões de uma equaćão quadrática
    // Mas não usa ainda a importaćão estática

public class Quadratic {
    public static void main(String[] args) {

        // a, b e c representam os coeficientes da
        // equaćão quadrática: a(x.x) + bx + c = 0
        double a, b, c, x;

        // Resolve 4(x.x) + x - 3 = 0
        a = 4;
        b = 1;
        c = -3;

        // Encontra a primeira solućão
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        // Encontra a segunda solućão
        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);
    }
}
