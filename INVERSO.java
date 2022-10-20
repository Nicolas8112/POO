import java.util.Scanner;
public class INVERSO {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = new int[10];

        System.out.println("El programa pedirá 10 números y después serán impresos en orden inverso:");

        for (int i =0;i<10;i++) {
            System.out.print("Número "+(i+1)+": ");
            numeros[i] = keyboard.nextInt();
        }
        System.out.println("Valores introducidos en orden inverso");
        for (int i=9; i>=0;i--) {
            System.out.println("Numero " + (i+1)+": "+numeros[i]);
        }
    }
}

