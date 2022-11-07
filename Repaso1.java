import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Repaso1 {

    public static void main(String[] args) {
       /*  int[] numArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 }; */
        // 0, 1, 2, 3, 4, 5, 6, 7, 8
       /*  int numero = 5, suma = 0; */
       /*  for (int i = 0; i <= numero; i++) { // 0,1,2,3,4,5
            System.out.println("intirante= " + i);
            suma = suma + i;
            System.out.println("suma = " + i);
        } */
        /* System.out.println("resultado= " + suma); */

        /* int largoArray = numArray.length;
        
        for (int i = 0; i < numArray.length; i++) {
            String s1 = String.valueOf(numArray[i]);
            System.out.println("la pocicion " + i + " obj de numArray " + numArray[i] + " "+ s1);
            suma = suma + numArray[i];
        }
        System.out.println("suma = " + suma); */

        /* String opc = "opcion3";
        switch (opc) {
            case "opcion1": // opc == 1
                System.out.println("entraste a la opcion 1");
                break; // siempre agrergar break al final de la ejecucion del code
            case "opcion2":
                System.out.println("entraste a la opcion 2");
                break;
            default:
                System.out.println("no seleccionaste ninguna opcion");
                break;
        }
       int i = 0;
        while(true){
            i++;
            System.out.println(i);
            break;
        } */
       /*  int numero2 = 0;
        Scanner scanner = new Scanner(System.in);
        Console consola = System.console();
        try {
            System.out.println("ingrese un numero");
            numero2 = Integer.parseInt(consola.readLine());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("no sea weon ingrese un numero");
        } */
        // cosole solo absorbe string y todo dato ingresado se vuelve string
        // scanner valida que un dato se el solicitado y si no es el ingresado da error el cual se puede validar con try_catch




        int[] numArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
                        //0, 1, 2, 3, 4, 5, 6, 7, 8
        /* int i = 0; */
        /*  while (i<numArray.length) {
            System.out.println("valor de i = "+i);
            System.out.println(numArray[i]);// para recorrer una lista simpre se usa corchetes []
            i++; // i = i + 1
        } */

        /* do {
            System.out.println("valor de i = "+i);
            System.out.println(numArray[i]);
            i++;
        } while (i<numArray.length); */

       /*  for (int posicion : numArray) {
            System.out.println(posicion);
        } */

    }
}