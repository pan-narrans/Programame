package Resueltos.E117_LaFiestaAburrida;

public class Main {

  static java.util.Scanner in;

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);

    // Nº de casos
    int numCasos = in.nextInt();
    in.nextLine();
    
    for (int i = 0; i < numCasos; i++)
    	System.out.println(in.nextLine().replace("Soy", "Hola,") + ".");
  }

}