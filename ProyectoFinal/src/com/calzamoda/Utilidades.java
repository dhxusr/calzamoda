package com.calzamoda;

import java.util.Scanner;

public class Utilidades {

  private Utilidades() {

  }

  /**
   * Limpia la consola
   */
  public static void limCon() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  /**
   * Recibe desde teclado un input y verifica si es de tipo int.
   * en caso de que no lo sea, se lo comunica al usuario.
   *
   * @param msg      Es el mensaje que se le quiere enviar al usuario
   *                 al momento de pedir el input.
   * @param negativo Se usar para indicar si se quieren numeros negativos o no.
   *
   * @return Devuelve el numero ingresado por consola.
   */
  public static int intInput(String msg, boolean negativo) {
    Scanner scn = new Scanner(System.in);
    int num;

    while (true) {
      System.out.printf("%s: ", msg);

      if (!scn.hasNextInt()) {
        System.out.println("Debe usar valores numericos.");
        scn.next();
        continue;
      }

      num = scn.nextInt();

      if (!negativo && num < 0) {
        System.out.println("Los valores deben ser mayor o igual que cero.");
        scn.next();
        continue;
      }

      return num;
    }
  }

  /**
   * Recibe desde teclado un input y verifica si es de tipo double.
   * en caso de que no lo sea, se lo comunica al usuario.
   *
   * @param msg      Es el mensaje que se le quiere enviar al usuario
   *                 al momento de pedir el input.
   * @param negativo Se usar para indicar si se quieren numeros negativos o no.
   *
   * @return Devuelve el numero ingresado por consola.
   */
  public static double doubleInput(String msg, boolean negative) {
    Scanner scn = new Scanner(System.in);
    double num;

    while (true) {
      System.out.printf("%s: ", msg);

      if (!scn.hasNextDouble()) {
        System.out.println("Debe usar valores numericos.");
        scn.next();
        continue;
      }

      num = scn.nextDouble();

      if (!negative && num < 0) {
        System.out.println("Los valores deben ser mayor o igual que cero.");
        scn.next();
        continue;
      }

      return num;
    }
  }

  /**
   * Una interfaz para inciar sesion y comprobar si los datos son correctos.
   *
   * @param cat Categoria para la interfaz por ejemplo:
   *            admin o cajero
   * @param usr Nombre de usuario registrado.
   * @param con Contrasena de usuario registrado.
   */
  public static void inicioSesion(String cat, String usr, String con) {
    String usrIn = "";
    String conIn = "";
    Scanner scn = new Scanner(System.in);

    while (true) {
      limCon();
      System.out.println("==================================================");
      System.out.println("     SISTEMA DE GESTIÓN - CALZAMODA STEP");
      System.out.println("==================================================");

      System.out.printf("[Inicio de Sesion - %s]\n", cat);
      System.out.print("Usuario: ");
      usrIn = scn.nextLine();

      System.out.print("Contrasena: ");
      conIn = scn.nextLine();

      System.out.println("--------------------------------------------------");

      if (!usr.equals(usrIn) || !con.equals(conIn)) {
        System.out.println("Usuario o contrasena invalidos. intentelo denuevo.");
        System.out.print("Enter para continuar...");
        scn.nextLine();
        continue;
      }
      return;
    }
  }
}
