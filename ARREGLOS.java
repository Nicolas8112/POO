import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;

public class ARREGLOS {

    public static void main (String[] arg){
        Character[] posicion = new Character[10];

        posicion[0]= 'S';
        posicion[1]= 'J';
        posicion[2]= 'l';
        posicion[3]= ' ';
        posicion[4]= ' ';
        posicion[5]= '@';
        posicion[6]= ' ';
        posicion[7]= ' ';
        posicion[8]= ' ';
        posicion[9]= ' ';

        //System.out.println("Cantidad de parámetros");
       for (int i = 0; i < 10; i++){

           System.out.println("caracter en la posicion #" + (i+1) + " = " + posicion[i]);
       }

        //System.out.println(posicion[0]);
        //System.out.println(posicion[1]);

    }

}
