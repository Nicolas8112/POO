import java.util.Scanner;
public class CICLOS {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int contador = 0;
        double num = 0, suma = 0;
        System.out.print("ESTE PROGRAMA CALCULA LA MEDIA DE DE LOS NUMEROS POSITIVOS" +
        "\nPARA PARA EL PROGRAMA INGRESE UN NUMERO NEGATIVO" +
        "\nINTRODUZCA NUMEROS: ");

        do {
            num = keyboard.nextDouble();
            if(num >0 ) {
                contador++;

                suma += num;
            }
        }while (num > 0);
        System.out.println("LA MEDIA DE NUMERO POSITIVOS SON: ");
        System.out.println(suma / contador);

    }
}

