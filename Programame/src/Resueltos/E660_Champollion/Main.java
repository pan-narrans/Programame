package Resueltos.E660_Champollion;

/**
 * Para cuando nos dan un número claro de casos de prueba.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  static java.util.Scanner in;

  public static void casoDePrueba() {
    String input;
    String regex = "\\b[aeiou]|(?:(?=[^aeiou\\s][aeiou][^aeiou\\s]([^aeiou]|\\Z))[^aeiou\\s][aeiou][^aeiou\\s]|[^aeiou\\s][aeiou])";
    List matches = new ArrayList<String>();
    
    input = in.nextLine();
    input = input.toLowerCase();

    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(input);
    while (matcher.find()) {
      matches.add(matcher.group());
    }

    matches = new ArrayList<>(new HashSet<>(matches));

    System.out.println(matches.size());
  }

  public static void main(String args[]) {
    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    in.nextLine();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();
  }

}