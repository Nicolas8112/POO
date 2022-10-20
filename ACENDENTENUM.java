import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ACENDENTENUM {
    public static Scanner Keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int entradaUno=0;
        int entradaDos=0;
        int entradaTres=0;

        System.out.println(" INGRESE un numero  1 ");
        entradaUno=Keyboard.nextInt();

        System.out.println(" INGRESE un numero  2 ");
        entradaDos= Keyboard.nextInt();

        System.out.println(" INGRESE un numero  3 ");
        entradaTres= Keyboard.nextInt();

        //primera entrada menor de todos
        if (entradaUno < entradaDos && entradaUno < entradaTres) {
            //entradados menor entrada
            if (entradaDos < entradaTres){
                System.out.println("Elementos en orden " + entradaUno + entradaDos + entradaTres );
            }
            else if (entradaTres < entradaDos){
                System.out.println("Elementos en orden " + entradaUno +  entradaTres + entradaDos);
            }
        }
        //segunda entrada menor de todos
        else if (entradaDos < entradaUno && entradaDos < entradaTres){
            if (entradaUno < entradaTres){
                System.out.println("Elementos en orden " + entradaDos + entradaUno + entradaTres );
            }
            else if(entradaTres <entradaUno)
                System.out.println("Elementos en orden " + entradaDos + entradaTres + entradaUno );
        }


        //tercara entrada menor de todos
        else if (entradaTres < entradaUno && entradaTres < entradaDos){
            if (entradaUno < entradaDos){
                System.out.println("Elementos en orden " + entradaTres + entradaUno + entradaDos );
            }
            else if(entradaDos  <entradaUno)
                System.out.println("Elementos en orden " + entradaTres + entradaDos + entradaUno );
        }

    }

}
