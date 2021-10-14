//Realizar un programa que calcule el factorial de un número:
//n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
//Sin hacer uso de librerías.


import java.util.Scanner;

public class ejN04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   //abre lectura

    System.out.print("Enter number: ");         //pide ingreso
    int number = scanner.nextInt();             //asigna

    scanner.close();                            //cierra lectura - abrir y cerrar lectura en lenguaje java

    System.out.println("El factorial de " + number + " es " + factorial(number));           // imprime
  }

  public static int factorial(int number) {

    if (number < 0 ){
        System.out.print("No existe el factorial de numeros negativos. ");
        return 0;
    }
    else if (number == 0) {
      return 1;
    } else {
      return number *= factorial(number - 1); //numero * si mismo, siguiente iteracion numero-1 y repetir
    }

  }
}