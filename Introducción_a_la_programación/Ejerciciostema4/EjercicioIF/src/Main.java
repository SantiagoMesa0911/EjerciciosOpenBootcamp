import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe un número:");
        double numeroIF = escaner.nextDouble();
        //System.out.println("Hello world!");
        if (numeroIF == 0) {
            System.out.println("El número es neutro");
        } else if (numeroIF < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
    }
}