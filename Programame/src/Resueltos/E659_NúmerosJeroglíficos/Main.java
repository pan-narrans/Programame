package Resueltos.E659_NúmerosJeroglíficos;
/**
 * Para cuando no nos avisan con una entrada concreta de que los casos de prueba
 * se han acabado.
 */
public class Main {

  static java.util.Scanner in;

  public static boolean casoDePrueba() {
    int n;
    n = in.nextInt();
    if (n == 0)
      return false;

    // 1, 10, 100, 1.000, 10.000, 100.000, 1.000.000
    String[] map = { "T", "G", "C", "F", "D", "R", "H" };
    String result = "";
    int i = 0;

    while (n > 0) {
      result = repeat(map[i++], n % 10) + result;
      n = n / 10;
    }

    System.out.println(result);

    return true;

  }

  public static String repeat(String s, int n) {
    return (n != 0) ? s + repeat(s, --n) : "";
  }

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);
    while (casoDePrueba())
      ;

  }

}