import java.util.Scanner;
public class ejN03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere probar.");
        int num = scanner.nextInt();
        scanner.close();
        //for (int i = 1; i < num; i++) {
        //System.out.println(i);
        //}

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
              System.out.print(j + " ");
            }
            System.out.println("");
          }
}
}