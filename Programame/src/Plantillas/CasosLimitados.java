package Plantillas;

/**
 * Para cuando nos dan un número claro de casos de prueba.
 */
public class CasosLimitados {

  static java.util.Scanner in;

  public static void casoDePrueba() {
    int n;
    n = in.nextInt();
    if ((n % 2) == 0)
      System.out.println("PAR");
    else
      System.out.println("IMPAR");
  }

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();
  }

}
