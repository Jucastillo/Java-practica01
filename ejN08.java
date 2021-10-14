/** Crear una aplicación que solicite de entrada los datos de una persona en este orden:
 - Nombre y Apellido
 - Edad
 - Dirección
 - Ciudad
 
 Luego imprimirá el siguiente mensaje:
 {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/

import java.util.Scanner;

public class ejN08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, city, address;
        Integer age;
        System.out.print("Ingrese su nombre y apellido: ");
        name = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        age = Integer.valueOf(scanner.nextLine());
        System.out.print("Ingrese su ciudad: ");
        city = scanner.nextLine();
        System.out.print("Ingrese su direccion: ");
        address = scanner.nextLine();
        scanner.close();

        System.out.println(String.format("{%s} - {%s} - {%d} - {%s}", city, address, age, name));
    }
}