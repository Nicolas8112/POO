
import javax.swing.*;
import java.util.Scanner;
public class DOLAR {
    public static Scanner Keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int Dolar =4600;
        int RESULTADO =0;
        int conversor= 0;

        System.out.println(" INGRESE VALOR A CONVERTIR ");
        conversor= Keyboard.nextInt();

        RESULTADO=Dolar*conversor;

        System.out.println(" LA CONVERSION ES DE "+RESULTADO);



    }


}
