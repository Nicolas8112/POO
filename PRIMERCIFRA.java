import java.util.Scanner;

public class PRIMERCIFRA {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int numeroEntero=0;

        System.out.println(" INGRESE un numero del 1 al 5");
        numeroEntero= keyboard.nextInt();


        if (numeroEntero>=1000);
        System.out.println(" EL PRIMER NUMERO DE LA CIFRA ES "+ Math.floor(numeroEntero/1000));

        /*/
        else if (numeroEntero>= 100);

        System.out.println(" EL PRIMER NUMERO DE LA CIFRA ES "+ Math.floor(numeroEntero/100));
        else if (numeroEntero>=10);

        System.out.println(" EL PRIMER NUMERO DE LA CIFRA ES " +Math.floor(numeroEntero/10));/*/






    }
}
