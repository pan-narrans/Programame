package Resueltos.E610_MrStark;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Para cuando nos dan un número claro de casos de prueba.
 */
public class Main {

  static java.util.Scanner in;

  public static void casoDePrueba() {
    ArrayList<String> population = new ArrayList<String>(Arrays.asList(new String[in.nextInt()]));

    population.set(in.nextInt() - 1, "stark");
    population.set(in.nextInt() - 1, "peter");

    int position = 0;
    int jump = in.nextInt();
    int maxJumps = (population.size() + 1) / 2;

    // Snap! Snap! Snap!
    // Deleting the population
    for (int i = 0; i < maxJumps; i++) {
      position += jump;

      while (position >= population.size())
        position -= population.size();

      population.remove(position);
    }

    // Checking for survivors
    boolean stark = population.contains("stark");
    boolean peter = population.contains("peter");

    // Cry a bit, it's okay
    if (stark && !peter)
      System.out.println("No quiero irme, Sr. Stark!");
    else if (!stark && peter)
      System.out.println("No quiero irme, Peter!");
    else
      System.out.println("No hay abrazo");

  }

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();
  }

}
