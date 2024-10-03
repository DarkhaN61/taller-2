import java.util.Scanner;

class multiplicacion {
    multiplicacion() {
    }
    public static void main(String[] var0) {
        System.out.println("aqui podra repetir el numero las veces que quiera ");
        Scanner a = new Scanner(System.in);
        System.out.println("ingrese un numero que quiera repetir: ");
        int b = a.nextInt();
        System.out.println("ingrese las veces que quiere repetirlo: ");
        int c = a.nextInt();
        int d = b;
        for(int i = 1; i <= c; ++i) {
            for(int z = 1; z == c; ++z) {
                d += b;
            }
            System.out.println("el numero es: " + d);
        }

    }
}
class descomposicion {
    descomposicion() {
    }

    public static void main(String[] var0) {
        Scanner n = new Scanner(System.in);
        System.out.println("ingrese un numero que quiera descomponer: ");
        int A = n.nextInt();
        int B = A;
        int C = 0;
        if (A < 10) {
            System.out.println("se descomposicion es: " + A);
        } else {
            for(; B >= 10; ++C) {
                int var3 = B % 10;
                B /= 10;
                int D = 10 ^ C;
                System.out.println("sus datos son: " + var3);
                if (B < 10) {
                    System.out.println("sus datos son: " + B);
                }
            }
        }

    }
}