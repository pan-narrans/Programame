package Resueltos.E658_LaAlturaDeLaPirámide;
public class Main {

  static java.util.Scanner in;

  public static boolean casoDePrueba() {
    int numBlocks;
    numBlocks = in.nextInt();

    if (numBlocks == 0)
      return false;

    int width = 1;
    int floors = 0;

    while (numBlocks > 0) {
      floors++;
      numBlocks -= width * width;
      width += 2;
    }

    System.out.println(floors);

    return true;
  }

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);
    while (casoDePrueba())
      ;
  }
}
