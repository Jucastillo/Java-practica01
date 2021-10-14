//Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).
import java.util.Scanner;
public class ejN06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el un numero entero");
        int primerN = scanner.nextInt();
        System.out.println("Ingrese el un numero entero");
        int segundoN = scanner.nextInt();
        scanner.close();
        
        int res = 1;     
        for (int i = 1; i<=segundoN; i++) {
            res = res * primerN;
        }
        System.out.println("el resultado es" +  res);      
    }
    
}
