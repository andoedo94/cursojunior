import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args)
    { /*
        String palabra = "hola", palabra2 = "hola";
        int numero1 = 4, numero2 = 8;
        String estudiante = "junior";
        boolean condicion = ((palabra != palabra2) || (numero1>numero2));

        System.out.println(condicion);

        if(!(estudiante == "junior"))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son diferentes");
        }
        */
        /*
        String opcion = "C";
        switch(opcion)
        {
            case "C":
                System.out.println("Es la C");
                break;
            case "F":
                System.out.println("Es la F");
                break;

            default:
                System.out.println("No existe la letra");
                break;
        }
        */

        String otro = "hola", ingreso="chao";
        String mensaje = (otro == ingreso) ? "Son iguales" :  "son diferentes";
        System.out.println(mensaje);





    }
}
