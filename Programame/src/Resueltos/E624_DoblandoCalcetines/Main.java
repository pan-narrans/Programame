package Resueltos.E624_DoblandoCalcetines;

import java.util.ArrayList;

public class Main {

  static java.util.Scanner in;

  public static boolean casoDePrueba() {
    int n = in.nextInt();
    if (n == 0) // Exit condition
      return false;

    int sock, max_desparejados = 1;
    ArrayList<Integer> mesa = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      sock = in.nextInt();

      // Añadir o quitar calcetines de la mesa
      if (mesa.contains(sock))
        mesa.remove(Integer.valueOf(sock));
      else
        mesa.add(sock);

      // Actualizar el número máximo de desparejados
      if (max_desparejados < mesa.size())
        max_desparejados = mesa.size();
    }

    System.out.println(max_desparejados);

    return true;
  }

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);
    while (casoDePrueba())
      ;
  }

}
