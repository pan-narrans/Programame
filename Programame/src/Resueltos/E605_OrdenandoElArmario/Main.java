package Resueltos.E605_OrdenandoElArmario;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Para cuando no nos avisan con una entrada concreta de que los casos de prueba
 * se han acabado.
 */
public class Main {

  static java.util.Scanner in;

  public static boolean casoDePrueba() {
    ArrayList<Character> prendas = new ArrayList<Character>();
    char n = in.next().charAt(0);

    while (n != '.') {
      prendas.add(n);
      n = in.next().charAt(0);
    }

    if (prendas.size() == 0)
      return false;

    // prendas.forEach(System.out::println);

    int prendasVerano = Collections.frequency(prendas, 'V');
    int prendasInvierno = Collections.frequency(prendas, 'I');

    System.out.println(
        (prendasInvierno > prendasVerano) ? "INVIERNO" : (prendasInvierno < prendasVerano) ? "VERANO" : "EMPATE");

    return true;

  }

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);
    while (casoDePrueba())
      ;
  }

}
