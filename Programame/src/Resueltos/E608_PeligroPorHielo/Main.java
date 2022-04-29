package Resueltos.E608_PeligroPorHielo;

/**
 * Para cuando no nos avisan con una entrada concreta de que los casos de prueba
 * se han acabado.
 */
public class Main {

  static java.util.Scanner in;

  public static boolean casoDePrueba() {
    int nMedidas;
    nMedidas = in.nextInt();
    if (nMedidas == 0)
      return false;

    int nAvisos = 0;
    boolean puedeAvisar = true;

    for (int i = 0; i < nMedidas; i++) {
      int aux = in.nextInt();
      if (puedeAvisar && aux < 5) {
        puedeAvisar = false;
        nAvisos++;
      }
      if (aux > 6)
        puedeAvisar = true;
    }

    System.out.println(nAvisos);

    return true;
  }

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);
    while (casoDePrueba())
      ;

  }

}
