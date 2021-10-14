import java.util.Scanner;
public class ejN02{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese su primer numero");
    int unoN = scan.nextInt();
    System.out.println("Ingrese su segundo numero");
    int dosN = scan.nextInt();
    scan.close();
    
    int suma = unoN+dosN;
    int resta = unoN-dosN;
    int multi = unoN*dosN;
    int divi = unoN/dosN;
    int diviMod = unoN%dosN;

    System.out.println("El resultado de la suma es " +suma);
    System.out.println("El resultado de la resta es " +resta);
    System.out.println("El resultado de la multiplicacion es " +multi);
    System.out.println("El resultado de la division es " +divi);
    System.out.println("El resultado del modulo es " +diviMod);
    
}
}
