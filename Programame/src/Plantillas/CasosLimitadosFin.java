package Plantillas;

/**
 * Para cuando no nos avisan con una entrada concreta de que los casos de prueba
 * se han acabado.
 */
public class CasosLimitadosFin {

  static java.util.Scanner in;

  public static boolean casoDePrueba() {
    int n;
    n = in.nextInt();
    if (n == -1)
      return false;
    if ((n % 2) == 0)
      System.out.println("PAR");
    else
      System.out.println("IMPAR");

    return true;

  }

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);
    while (casoDePrueba())
      ;

  }

}
