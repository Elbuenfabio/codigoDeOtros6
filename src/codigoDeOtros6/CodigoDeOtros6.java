package codigoDeOtros6;
import java.util.Scanner;

public class CodigoDeOtros6 {
	public static void main(String[] args) {
	//La declaración del arreglo debe tener los corchetes después del tipo de dato:
    int[] n = new int[20];
    //En el ciclo for, el operador de incremento debe ser i++, no i+.
    for (int i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
    //En la línea que imprime el arreglo, System.print no es una función válida. Debe ser System.out.print.
      System.out.print(n[i] + " ");
    }
    
    System.out.println("\n¿Qué números quiere resaltar? ");
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    //En la línea que pide al usuario que seleccione una opción, la función System.console().readLine() debe tener un paréntesis de cierre al final.
    int opcion = Integer.parseInt(System.console().readLine());

    int multiplo = (opcion == 1) ? 5 : 7;
    //En el ciclo foreach, el tipo de dato debe ser int, no char, ya que estamos iterando sobre un arreglo de enteros. Además, la llave que cierra el bloque del if debe estar antes de la llave que cierra el bloque del else.
    for (int e : n) {
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      } else {
        System.out.print(e + " ");
      }
    }
  }
  
}

