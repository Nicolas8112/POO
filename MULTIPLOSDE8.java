import java.util.Scanner;

public class MULTIPLOSDE8 {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {



        int multiplo=0; // Múltiplo
       // int cont; // Contador

/*/System.out.print("¿Hasta qué número quieres la lista?: ");
    n = keyboard.nextInt();/*/
       /* for (cont=1; cont <=100; cont++) {

        if (cont % multiplo == 0)
            System.out.println(cont);/*/
        while (multiplo< 100){
            multiplo++;
            if (multiplo%8==0){
                System.out.println(" ES MULTIPLO DE 8 "+multiplo);
            }

    }

}
}
