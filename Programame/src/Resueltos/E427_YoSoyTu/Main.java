package Resueltos.E427_YoSoyTu;

public class Main {

  static java.util.Scanner in;

  public static void main(String args[]) {
    // Scanner
    in = new java.util.Scanner(System.in);

    // Nº de casos
    int nCases = in.nextInt();
    in.nextLine();

    String person;
    String relation;
    StringBuilder string = new StringBuilder();

    for (int i = 0; i < nCases; i++) {
      string = new StringBuilder();
      person = in.nextLine();
      relation = in.nextLine();

      if (person.equals("Luke") && relation.equals("padre")) {
        string.append("TOP SECRET");
      } else {
        string.append(person).append(", yo soy tu ").append(relation);
      }

      System.out.println(string);
    }
  }

}
