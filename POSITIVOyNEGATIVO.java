import java.util.Scanner;

public class POSITIVOyNEGATIVO {

    public static void main(String[] arg) {
        int cont = 0, contador = 0;
        int[] num = new int[8];

        System.out.print(" INGRESE 8  NUMEROS ");

        for (int i = 0; i < 8; i++) {
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();

            if(num[i]%2 ==0)
            {

                cont++;
            }
            else if(num[i]%2 != 0) {
                contador++;
            }

        }

        System.out.println(" LOS NUMEROS PARES SON " + cont + "\n LOS NUMEROS IMPARES SON " + contador);
    }
}

