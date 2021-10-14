// Realizar un programa que dado un String de entrada en minúsculas lo 
// convierta por completo a mayúsculas. Sin uso de métodos o librerías 
// que realicen toUppercase(). 
//

import java.util.Scanner;

public class ejN07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Escriba una palabra en minusculas: ");
        string = scanner.nextLine();
        scanner.close();
        String output = "";

        for (char c : string.toCharArray()) {
            output += (char) (((int) c) - 32);
        }

        System.out.println(output);
    }
}