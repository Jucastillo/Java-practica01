//Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
import java.util.Scanner;

public class ejN05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int num1 = scanner.nextInt();
        System.out.println("Escriba el segundo numero");
        int num2 = scanner.nextInt();
        scanner.close();

        int res = 0;
        for (int i = 1; i <= num2; i++)
            res = res + num1;

        System.out.println("El resultado es " + res);
    }
}
