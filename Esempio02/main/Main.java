package main;
import main.CallMe;

// Esempio_02# javac -d . principale/*.java
// java -cp . principale.Main 

public class Main {

  public static void main(String[] args) {
      System.out.println("richiamo CallMe");
      CallMe.stampa();
  }
}
